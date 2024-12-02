package ajou.usedkoi.backend.presentation.api;

import ajou.usedkoi.backend.domain.service.RegionService;
import ajou.usedkoi.backend.presentation.dto.RegionDto;
import ajou.usedkoi.backend.presentation.dto.RegionsDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="*", allowedHeaders = "*")
@RequiredArgsConstructor
public class RegionApi {
    private final RegionService regionService;
    private static final Logger LOGGER =
            LoggerFactory.getLogger(HealthApi.class);

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public RegionsDto getAllRegions(){
        LOGGER.info("getAllRegions");

        var allRegions = regionService.getAllRegions();
        var dtoList = new ArrayList<RegionDto>();
        allRegions.forEach(region -> {
            var dto = new RegionDto(region);
            dtoList.add(dto);
        });
        var regionsDto = new RegionsDto(dtoList);
        return regionsDto;
    }
}

