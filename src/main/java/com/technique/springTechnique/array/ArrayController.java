package com.technique.springTechnique.array;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @Author Muhammad Saimon
 * @since Aug 18, 2021 2:31 PM
 */

@Slf4j
@Controller
@RequestMapping("/array")
public class ArrayController {

    @ResponseBody
    @GetMapping
    public Object[] array() {

        String[] countries = {"Canada", "Finland", "Germany", "Norway", "Netherlands"};
        log.info("new Countries : {}", Arrays.toString(countries));

        String[] newCountries = ArrayUtils.insert(3, countries, "Dubai", "Saudi Arabia");
        log.info("new Countries : {}", Arrays.toString(newCountries));

        ArrayUtils.swap(newCountries, 3, 6);
        log.info("new Countries after swapping : {}", Arrays.toString(newCountries));

        return newCountries;
    }
}
