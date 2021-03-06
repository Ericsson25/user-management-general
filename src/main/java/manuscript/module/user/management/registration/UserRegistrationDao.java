package manuscript.module.user.management.registration;

import java.util.List;

import manuscript.module.user.management.bean.AdditionalData;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.request.UserRegistrationRequest;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationDao {

	public boolean isNameReserved(String userName);

	public List<Role> getDefaultRole();

	public User createRegistration(UserRegistrationRequest request, AdditionalData additionalData);
}
