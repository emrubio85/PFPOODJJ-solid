public class BusquedaporApellidoPaterno implements Busqueda{

     @Override
    public List<Cliente> buscar(ArrayList<Cliente> clientes, String filtro) {
        List<Cliente> resultados = new ArrayList<>();
        String cadena = filtro.substring(0, 1).toUpperCase() + filtro.substring(1);

        for (Cliente cliente : clientes) {
            if (cliente.getSurname1().equals(cadena)) {
                resultados.add(cliente);
            }
        }

        return resultados;
    }
}
