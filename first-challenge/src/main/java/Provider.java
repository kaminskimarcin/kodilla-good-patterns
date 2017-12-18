import java.util.Map;

public interface Provider {
    Map<String, Integer> process(DeliverRequest deliverRequest);
}
