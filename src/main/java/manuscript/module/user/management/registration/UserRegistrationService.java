package manuscript.module.user.management.registration;

import manuscript.module.user.management.exception.NameAlreadyReservedException;
import manuscript.module.user.management.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * Contains all method that related with the registration process.
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationService {

	/**
	 * It will start the registration process.
	 * 
	 * @param UserRegistrationRequest
	 * @return UserRegistrationResponse
	 * @throws NameAlreadyReservedException
	 */
	public UserRegistrationResponse createRegistration(UserRegistrationRequest request)
			throws NameAlreadyReservedException;

	/**
	 * Return all necessary data that will able to use the user under the
	 * registration process.
	 * 
	 * @return UserRegistrationPreloadResponse
	 */
	public UserRegistrationPreloadResponse userRegistrationPreload();

}
