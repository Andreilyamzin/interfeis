public class ServiceStation {

    public void servise(Transport transport){
        if(transport != null) {
            System.out.println("Обслуживание - " + transport.getModelName());
            transport.servise();
        }
    }
}