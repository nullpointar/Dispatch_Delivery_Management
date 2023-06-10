package com.ddportal.controller;

import com.ddportal.entity.Cargo;
import com.ddportal.entity.DeliveryOptions;
import com.ddportal.service.DeliveryOptionsService;
import java.io.IOException;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private DeliveryOptionsService deliveryOptionService;

    @RequestMapping(value = "/deliveryoptions", method = RequestMethod.POST)

    @ResponseBody
    public static List<DeliveryOptions> getOptions(@RequestBody Cargo cargo) throws IOException,
                                                                         InterruptedException, ApiException {
        return DeliveryOptionsService.retrieveOptions(cargo);
    }
}
