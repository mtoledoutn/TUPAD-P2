package dependencias.ej14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        new Render(formato, proyecto);
    }
}
