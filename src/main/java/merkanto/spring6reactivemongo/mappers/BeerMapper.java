package merkanto.spring6reactivemongo.mappers;

import merkanto.spring6reactivemongo.domain.Beer;
import merkanto.spring6reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
