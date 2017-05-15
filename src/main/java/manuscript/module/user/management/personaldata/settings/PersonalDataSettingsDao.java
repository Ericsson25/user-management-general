package manuscript.module.user.management.personaldata.settings;

import java.util.List;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.request.SavePersonalDataRequest;
import manuscript.module.user.management.request.UpdateAcademicDisciplinesRequest;
import manuscript.module.user.management.request.UpdatePassword;
import manuscript.system.security.core.userdetails.ExtendedUserDetails;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface PersonalDataSettingsDao {

	public User getUserData(ExtendedUserDetails authenticatedUser);

	public List<AcademicDisciplines> getAcademicDisciplinesByUserId(String userId);

	public void updatePersonalData(SavePersonalDataRequest request, String userId);

	public String getPasswordByUserId(String userId);

	public void updatePassword(UpdatePassword updatePassword);

	public void updateAcademicDisciplinesByUserId(UpdateAcademicDisciplinesRequest academicDisciplinesRequest,
			String userId);
}
