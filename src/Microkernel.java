import java.util.HashMap;
import java.util.Map;

class Microkernel {
    private Map<String, Plugin> plugins = new HashMap<>();

    public void registerPlugin(String name, Plugin plugin) {
        plugins.put(name, plugin);
    }

    public String executePlugin(String name, String input) {
        if (plugins.containsKey(name)) {
            return plugins.get(name).execute(input);
        } else {
            throw new IllegalArgumentException("Plugin no encontrado: " + name);
        }
    }
}