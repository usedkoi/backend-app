package ajou.usedkoi.backend;

import ajou.usedkoi.backend.persistence.repository.RegionRepository;
import ajou.usedkoi.backend.presentation.api.RegionApi;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
public class RegionApiTest {
    @Autowired
    private RegionApi regionApi;

    @Mock
    private RegionRepository regionRepository;

    @Test
    public void testGetAllRegions() {
        var result = regionApi.getAllRegions();
        assertThat(result.getRegionDtoList()).hasSize(4);
    }
}
