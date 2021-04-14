package fr.service.answer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.service.answer.bll.ResponseService;
import fr.service.answer.networking.data.ResponseBody;

@RestController
public class ResponseController {

    /**
     * @author yannk
     *
     */
    @Autowired
    private ResponseService responseService;

    /**
     * example d'appel post man sur l'url : http://localhost:8080/response.
     * en POST
     * body en raw JSON
     * {
            "userAnswerId": 0,
            "answer": true,
        }
     * @param responseBody
     * @return resultas
     */
    @RequestMapping(path = "/response", method = RequestMethod.POST)
    public final String answer(final @RequestBody ResponseBody responseBody) {
        return responseService.answer(responseBody);
    }

}
