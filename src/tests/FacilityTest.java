package tests;

import android.renderscript.Double2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import src.Model.Building;
import src.Model.FacilityInfo;
import src.Model.Maintenance;
import src.Model.interface_Facility;
import src.Model.interface_Maintenance;


public class FacilityTest extends junit.framework.TestCase {

    private Building building1;
    private int numberOfFacilities;
    private ArrayList<interface_Facility> facilityInfo = new ArrayList<interface_Facility>();
    private ArrayList<interface_Facility> facilities = new ArrayList<interface_Facility>();
    private Maintenance maintDetails = new Maintenance();
    private ArrayList<interface_Maintenance> maintReports = new ArrayList<interface_Maintenance>();


    @Before
    public void setUp() throws Exception {

        //building1
        FacilityInfo building1 = new FacilityInfo();

        building1.setFacilityID(1);
        building1.setPhoneNumber(312111);
        building1.setAddress("26 E Pearson St");
        building1.setCity("Chicago");
        building1.setState("Illinois");
        building1.setZipCode(60611);

    }

    @After
    public void tearDown() throws Exception {
    }

    //CITY TEST
    @Test
    public void testCity() {
        FacilityInfo tBuilding = new FacilityInfo();
        tBuilding.setCity("CHICAGO");
        String result = tBuilding.getCity();
        assertEquals(result, "CHICAGO");
    }


    //ADDRESS TEST
    @Test
    public void testAddress() {
        FacilityInfo tBuilding = new FacilityInfo();
        tBuilding.setAddress("26 E Pearson St");
        String result = tBuilding.getAddressField();
        assertEquals(result, "26 E Pearson St");
    }

    //PHONE TEST
    @Test
    public void testPhone() {
        FacilityInfo tBuilding = new FacilityInfo();
        tBuilding.setPhoneNumber(312111);
        long result = tBuilding.getPhoneNumber();
        assertEquals(result, 312111);
    }

    //ID TEST
    @Test
    public void testSetFacilityID() {
        FacilityInfo tBuilding = new FacilityInfo();
        tBuilding.setFacilityID(111);
        int result = tBuilding.getFacilityID();
        assertEquals(result, 111);
    }

    //ZIP CODE TEST
    @Test
    public void testFacilityZip() {
        FacilityInfo tBuilding = new FacilityInfo();
        tBuilding.setZipCode(60660);
        int result = tBuilding.getZipCode();
        assertEquals(result, 60660);
    }

}