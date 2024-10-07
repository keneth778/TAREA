package view;

import controller.TareasController;
import model.Tarea;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TareasView extends JFrame {

    private JPanel panelControles;
    private JPanel panelTareas;
    private TareasController tareasController;

    public TareasView() {
        setTitle("Gestión de Tareas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        panelControles = new JPanel();
        panelTareas = new JPanel();
        panelTareas.setLayout(new BoxLayout(panelTareas, BoxLayout.Y_AXIS));

        add(panelControles, BorderLayout.NORTH);
        add(panelTareas, BorderLayout.CENTER);

        crearInterfazControl();
    }

    public void setController(TareasController tareasController) {
        this.tareasController = tareasController;
    }

    private void crearInterfazControl() {
        JButton botonCrear = new JButton("Crear Tarea");
        JButton botonEliminar = new JButton("Eliminar Tarea");

        panelControles.add(botonCrear);
        panelControles.add(botonEliminar);

        botonCrear.addActionListener(e -> abrirFormularioNuevaTarea());
        botonEliminar.addActionListener(e -> abrirFormularioEliminarTarea());
    }

    public void actualizarListaTareas(List<Tarea> tareas) {
        panelTareas.removeAll();

        for (Tarea tarea : tareas) {
            JLabel tareaLabel = new JLabel(tarea.toString());
            panelTareas.add(tareaLabel);
        }

        panelTareas.revalidate();
        panelTareas.repaint();
    }

    private void abrirFormularioNuevaTarea() {
    }

    private void abrirFormularioEliminarTarea() {
    }
}
