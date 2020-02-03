package com.hamstercloud.shop.feature.product.list.toys;

import com.hamstercloud.shop.Feature;
import com.hamstercloud.common.helper.ApiResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope("prototype")
public class Toys extends Feature{

  public ApiResponse<List<ToyDto>> handle() {
    List<ToyDto> toys = getToys();

    return new ApiResponse<List<ToyDto>>(toys);
  }

  private List<ToyDto> getToys() {
    List<ToyDto> results = new ArrayList<ToyDto>();

    List<Toy> toys = getToysFromSomeDataSource();

    if(toys != null && !toys.isEmpty()) {
      toys.forEach(i -> {
        results.add(Toy.getDtoFromToy(i));
      });
    }

    return results;
  }

  private List<Toy> getToysFromSomeDataSource() {
    List<Toy> results = new ArrayList<Toy>();

    // @TODO: Replace with real data source.

    Toy toy = new Toy();
    toy.setId(1);
    toy.setName("Train Set");
    results.add(toy);

    toy = new Toy();
    toy.setId(1);
    toy.setName("Blocks");
    results.add(toy);

    toy = new Toy();
    toy.setId(1);
    toy.setName("Soccer Ball");
    results.add(toy);

    toy = new Toy();
    toy.setId(1);
    toy.setName("Action Figure");
    results.add(toy);

    return results;
  }


  public static class Toy {

    private int id;
    private String name;
    private Date createdAt;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Date getCreatedAt() {
      return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
    }

    public static ToyDto getDtoFromToy(Toy toy) {
      if(toy == null) return null;

      ToyDto dto = new ToyDto();
      dto.setId(toy.getId());
      dto.setName(toy.getName());
      dto.setCreatedAt(toy.getCreatedAt());

      return dto;
    }
  }
}
