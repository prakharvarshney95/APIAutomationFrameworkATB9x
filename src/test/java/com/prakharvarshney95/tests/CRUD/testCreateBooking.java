package com.prakharvarshney95.tests.CRUD;

import com.prakharvarshney95.base.BaseTest;
import com.prakharvarshney95.endpoints.APIConstants;
import com.prakharvarshney95.pojos.BookingResponse;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class testCreateBooking extends BaseTest {

    @Owner("Promode")
    @TmsLink("https://google.com")
    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT-4")
    @Issue("JIRA_RBT-4")
    @Description("Verify that POST request is working fine.")
    @Test(groups = "qa")
    public void testVerifyCreateBookingPOST01() {
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.createPayloadBookingAsString()).post();


        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());

        assertActions.verifyStringKey(bookingResponse.getBooking().getFirstname(), "James");

    }

}
