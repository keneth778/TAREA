import controller.TareasController;
import services.DataTareas;
import view.TareasView;

public class Main {
    public static void main(String[] args) {
        DataTareas dataTareas = new DataTareas();
        TareasView tareasView = new TareasView();
        TareasController tareasController = new TareasController(dataTareas, tareasView);

        tareasView.setController(tareasController);
        tareasView.setVisible(true);
    }
}
