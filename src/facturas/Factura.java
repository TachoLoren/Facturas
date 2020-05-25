package facturas;

public  class Factura implements Ifactura{
	
	public int num;
	public float base;
	public float tipoIva;
	protected Estados estado;
	
	public static void main (String[] args) {
		
	}

	@Override
	public void cambiarEstado(Estados estado) {
		
	}

	@Override
	public float getTotal() {
		return 0;
	}

	@Override
	public float getCantidadIva() {
		return 0;
	}

	
	
	

	
}
