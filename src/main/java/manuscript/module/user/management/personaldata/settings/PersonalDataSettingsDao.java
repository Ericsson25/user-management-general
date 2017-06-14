package manuscript.module.user.management.personaldata.settings;

import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.request.SavePersonalDataRequest;
import manuscript.module.user.management.request.UpdatePassword;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface PersonalDataSettingsDao {

	public User getUserData(String userId);

	public void updatePersonalData(SavePersonalDataRequest request, String userId);

	public String getPasswordByUserId(String userId);

	public void updatePassword(UpdatePassword updatePassword);

}
