package ajou.usedkoi.backend.domain.service;

import ajou.usedkoi.backend.domain.model.Region;
import ajou.usedkoi.backend.domain.service.RegionService;
import ajou.usedkoi.backend.persistence.repository.RegionRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {
    private final RegionRepository regionRepository;

    @Override
    public List<Region> getAllRegions() {
        var regionEntities = regionRepository.findAll();
        var regionList = new ArrayList<Region>();
        regionEntities.forEach(entity -> regionList.add(new Region(entity)));
        return regionList;
    }
}

