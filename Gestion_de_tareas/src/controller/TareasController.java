package controller;

import model.Tarea;
import services.DataTareas;
import view.TareasView;

public class TareasController {

    private DataTareas dataTareas;
    private TareasView tareasView;

    public TareasController(DataTareas dataTareas, TareasView tareasView) {
        this.dataTareas = dataTareas;
        this.tareasView = tareasView;

        cargarTareas();
    }

    public void cargarTareas() {
        tareasView.actualizarListaTareas(dataTareas.getTareas());
    }

    public void agregarTarea(String titulo, String descripcion, String fechaLimite, String estado) {
        Tarea tarea = new Tarea(titulo, descripcion, fechaLimite, estado);
        dataTareas.agregarTarea(tarea);
        cargarTareas();
    }

    public void eliminarTarea(String titulo) {
        dataTareas.eliminarTareaPorTitulo(titulo);
        cargarTareas();
    }
}
