public class Iphone implements Reprodutor, Telefone, Navegador {
    private String model;
    private int storage;
    private String os;

    public Iphone(String model, int storage, String os) {
        this.model = model;
        this.storage = storage;
        this.os = os;
    }

    // Implementação dos métodos de IReprodutor
    @Override
    public void play() {
        System.out.println("Playing music on iPhone");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on iPhone");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on iPhone");
    }

    // Implementação dos métodos de ITelefone
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " from iPhone");
    }

    @Override
    public void answer() {
        System.out.println("Answering call on iPhone");
    }

    @Override
    public void hangUp() {
        System.out.println("Hanging up call on iPhone");
    }

    // Implementação dos métodos de INavegador
    @Override
    public void browse(String url) {
        System.out.println("Browsing to " + url + " on iPhone");
    }

    @Override
    public void back() {
        System.out.println("Going back on iPhone browser");
    }

    @Override
    public void forward() {
        System.out.println("Going forward on iPhone browser");
    }

    // Getters and Setters (se necessário)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}