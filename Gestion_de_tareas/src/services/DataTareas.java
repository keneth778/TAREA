package services;

import model.Tarea;

import java.util.ArrayList;
import java.util.List;

public class DataTareas {
    private List<Tarea> tareas;

    public DataTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTareaPorTitulo(String titulo) {
        tareas.removeIf(t -> t.getTitulo().equals(titulo));
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
