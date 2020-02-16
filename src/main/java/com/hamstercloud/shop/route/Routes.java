package com.hamstercloud.shop.route;

import com.hamstercloud.common.helper.ApiResponse;
import com.hamstercloud.shop.feature.toys.ToyDto;
import com.hamstercloud.shop.feature.toys.Toys;
import java.util.List;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/shop")
public class Routes {

  @RequestMapping(value = "/toys", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ApiResponse<List<ToyDto>> productListToys() throws ApplicationException {
    return Toys.handle();
  }
}
