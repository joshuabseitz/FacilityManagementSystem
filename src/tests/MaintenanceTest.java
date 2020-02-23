package tests;

import org.junit.Test;

import src.Model.Date;
import src.Model.MaintenanceRequest;
import src.Model.MaintenanceOrder;

public class MaintenanceTest extends junit.framework.TestCase{

    private Date tDate = new Date(01, 02, 2020);
    private MaintenanceRequest tRequest2 = new MaintenanceRequest();

    //MAINTENANCE DETAIL TEST
    @Test
    public void testMaintenanceDetail() {
        MaintenanceRequest tRequest = new MaintenanceRequest();
        tRequest.setDetail("Door will not fully close");
        String result = tRequest.getDetail();
        assertEquals(result, "Door will not fully close");
    }

    //MAINTENANCE PRIORITY TEST
    @Test
    public void testMaintenancePriority() {
        MaintenanceRequest tRequest = new MaintenanceRequest();
        tRequest.setPriority(3);
        int result = tRequest.getPriority();
        assertEquals(result, 3);
    }

    //MAINTENANCE DATE TEST
    @Test
    public void testMaintenanceDate() {
        MaintenanceRequest tRequest = new MaintenanceRequest();
        tRequest.setRequestDate(tDate);
        Date result = tRequest.getRequestDate();
        assertEquals(result, tDate);
    }

    //MAINTENANCE ORDER DATE TEST
    @Test
    public void testMaintenanceOrderDate() {
        MaintenanceOrder tOrder = new MaintenanceOrder(tRequest2, tDate, 250);
        tOrder.setRequestDate(tDate);

        Date result = tOrder.getRequestDate();
        assertEquals(result, tDate);
    }

    //MAINTENANCE ORDER COST TEST
    @Test
    public void testMaintenanceOrderCost() {
        MaintenanceOrder tOrder = new MaintenanceOrder(tRequest2, tDate, 250);
        tOrder.setRequestDate(tDate);

        int resultCost = tOrder.getCost();
        assertEquals(resultCost, 250);
    }
}
