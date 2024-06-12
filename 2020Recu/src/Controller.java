public class Controller {
    public void View(Image image){
        Viewer viewer;
        switch (resolution) {
            case Resolution.LOW:
                viewer = new LowResViewer();
                break;
            case Resolution.HIGH:
                viewer = new HighResViewer();
                break;
            default:
                throw new IllegalStateException("invalid resolution " + resolution);
        }
        viewer.view(image);
    }

    public void print(Image image) {
        Printer printer;
        switch (resolution) {
            case Resolution.LOW:
                printer = new LowResPrinter();
                break;
            case Resolution.HIGH:
                printer = new HighResPrinter();
                break;
            default:
                throw new IllegalStateException(
                        "invalid resolution " + this.resolution);
                printer.print(image);
        }
    }
}
