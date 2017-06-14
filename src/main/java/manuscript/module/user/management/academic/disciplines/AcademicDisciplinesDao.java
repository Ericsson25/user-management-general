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
	 * Visszaadja a felhasználó összes mentett {@link AcademicDisciplines}-ét.
	 * 
	 * @param userId
	 * @return {@link List}, mely tartalmazza az {@link AcademicDisciplines}-eket.
	 */
	public List<AcademicDisciplines> getDisciplinesByUserId(String userId);

	/**
	 * Updateli a meglévõ {@link AcademicDisciplines}-eket, ha létezik már az adott ID-vel. Ha nem, akkor beszúr egy újat az adott felhasználóhoz
	 * 
	 * @param userId
	 * @param academicDisciplines
	 */
	public void updateDisciplinesByUserId(String userId, List<AcademicDisciplines> academicDisciplines);
}
