package manuscript.module.user.management.academic.disciplines;

import java.util.HashMap;
import java.util.List;

import manuscript.module.user.management.bean.AcademicDisciplines;

public interface AcademicDisciplinesDao {

	public static final String GET_DISICPLINES_AS_LIST_CACHE = "manuscript.module.user.management.academic.disciplines.AcademicDisciplinesDao.getDisciplinesAsList";
	public static final String GET_DISICPLINES_AS_MAP_CACHE = "manuscript.module.user.management.academic.disciplines.AcademicDisciplinesDao.getDisciplinesAsMap";

	public HashMap<String, AcademicDisciplines> getDisciplinesAsMap();

	public List<AcademicDisciplines> getDisciplinesAsList();

	public void updateOrInsertDisciplines(AcademicDisciplines academicDisciplines);

	public AcademicDisciplines getSingleDisciplinesById(String disciplinesId);

	public void removeDisciplinesById(String disciplinesId);

	/**
	 * Visszaadja a felhaszn�l� �sszes mentett {@link AcademicDisciplines}-�t.
	 * 
	 * @param userId
	 * @return {@link List}, mely tartalmazza az {@link AcademicDisciplines}-eket.
	 */
	public List<AcademicDisciplines> getDisciplinesByUserId(String userId);

	/**
	 * Updateli a megl�v� {@link AcademicDisciplines}-eket, ha l�tezik m�r az adott ID-vel. Ha nem, akkor besz�r egy �jat az adott felhaszn�l�hoz
	 * 
	 * @param userId
	 * @param academicDisciplines
	 */
	public void updateDisciplinesByUserId(String userId, List<AcademicDisciplines> academicDisciplines);
}
