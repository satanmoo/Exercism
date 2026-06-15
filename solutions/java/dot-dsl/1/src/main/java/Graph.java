import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public final class Graph {

    private final Set<Node> nodes = new HashSet<>();
    private final Set<Edge> edges = new HashSet<>();
    private final Map<String, String> attributes = new HashMap<>();

    public Graph() {
    }

    public Graph(final Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return Set.copyOf(nodes);
    }

    public Collection<Edge> getEdges() {
        return Set.copyOf(edges);
    }

    public Graph node(final String name) {
        final Node node = new Node(name);
        nodes.add(node);
        return this;
    }

    public Graph node(final String name, final Map<String, String> attributes) {
        final Node node = new Node(name, attributes);
        nodes.add(node);
        return this;
    }

    public Graph edge(final String start, final String end) {
        final Edge edge = new Edge(start, end);
        edges.add(edge);
        return this;
    }

    public Graph edge(final String start, final String end, final Map<String, String> attributes) {
        final Edge edge = new Edge(start, end, attributes);
        edges.add(edge);
        return this;
    }

    public Map<String, String> getAttributes() {
        return Map.copyOf(attributes);
    }
}
