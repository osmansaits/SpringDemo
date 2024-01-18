 package kodlama.io.rentAcar.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;
	
	public BrandManager(BrandRepository brandRepository) {
			this.brandRepository = brandRepository;
		}
	
	@Override
	public List<Brand> getAll() {
		// TODO Business logic
		return brandRepository.getAll();
	
	}
}
