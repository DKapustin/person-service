package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Address;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AddressMapper {

    @Select ("SELECT id, contact_id as contactId, country_id as countryId, city, index, street, building, flat " +
            "FROM medical.address")
    List<Address> getAllAddress();

    @Select ("SELECT id, contact_id as contactId, country_id as countryId, city, index, street, building, flat " +
            "FROM medical.address WHERE id = #{addressId}")
    Address getAddressById(@Param("addressId") long addressId);

    @Insert ("INSERT INTO medical.address (id, contact_id, country_id, city, index, street, building, flat) " +
            "VALUES (#{id}, #{contactId}, #{countryId}, #{city}, #{index}, #{street}, #{building}, #{flat})")
    int addAddress(Address address);

    @Delete("DELETE FROM medical.address WHERE id = #{addressId}")
    void deleteAddressById(@Param("addressId") long addressId);

}
