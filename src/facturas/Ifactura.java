package facturas;

public interface Ifactura {
	
	void cambiarEstado(Estados estado);
	float getTotal();
	float getCantidadIva();

}
