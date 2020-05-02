package lab4;
public class Estudiante {
    String Nombre;
    float[] notas;
    float promedio;
    public Estudiante(String Nombre, float[] notas) {
        this.Nombre = Nombre;
        this.notas = notas;
        float acumulador = 0;
        for(int i=0;i<notas.length;i++)
        {
            acumulador=acumulador+notas[i];
        }
        this.promedio=acumulador/notas.length;
        
    }
}
