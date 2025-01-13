import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;


public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget) {
        // Construir la URL de la API
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a44e6a6d609ffa5e0cb9725a/pair/" + monedaBase + "/" + monedaTarget);

        // Crear un HttpCliente y la Request Http (este codigo lo sacamos de java docs)
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // convertir la respuesta JSON a un objeto de Monedas
            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (Exception e) {
            // Lanzar una excepcion especifica en caso de error
            throw new MonedaNoEncontradaException("No se encontró la moneda");
        }
    }
}

// Excepción personalizada para manejar errores relacionados con la moneda
class MonedaNoEncontradaException extends RuntimeException {
    public MonedaNoEncontradaException(String message) {
        super(message);
    }
}

