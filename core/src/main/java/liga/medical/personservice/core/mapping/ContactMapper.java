package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Contact;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ContactMapper {

    @Select("SELECT id, phone_number as phoneNumber, email, profile_link as profileLink " +
            "FROM medical.contact")
    List<Contact> getAllContact();

    @Select("SELECT id, phone_number as phoneNumber, email, profile_link as profileLink " +
            "FROM medical.contact WHERE id = #{contactId}")
    Contact getContactById(@Param("contactId") long contactId);

    @Insert("INSERT INTO medical.contact (id, phone_number, email, profile_link) " +
            "VALUES (#{id}, #{phoneNumber}, #{email}, #{profileLink})")
    int addContact(Contact contact);

    @Delete("DELETE FROM medical.contact WHERE id = #{contactId}")
    void deleteContactById(@Param("contactId") long contactId);
}
