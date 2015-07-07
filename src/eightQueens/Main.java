package eightQueens;

public class Main {
	public static void main (String [] args) {
		return;
	}
}

/*
public boolean solucionReinas()
{
solucion = false;
ponerReina(1);
return solucion;
} private void ponerReina(int i)
{
int j;
j = 0; // inicializa posibles movimientos
do {
j++;
reinas[i] = j; // prueba a colocar reina i en fila j,
// a la vez queda anotado el movimiento
if (valido(i))
{
if (i < N) // no completado el problema


{
ponerReina(i+1);
// vuelta atrás
if (!solucion)
reinas[i] = 0;
}
else // todas las reinas colocadas
solucion = true;
}
} while(!solucion && (j < 8));
}
private boolean valido(int i)
{

int r;
boolean libre;
libre = true;
for (r = 1; r <= i-1; r++)
{
// no esté en la misma fila
libre = libre && (reinas[i] != reinas[r]);
// no esté en alguna de las dos diagonales
libre = libre && ((i + reinas[i]) != (r + reinas[r]));
libre = libre && ((i - reinas[i]) != (r - reinas[r]));
}
*/