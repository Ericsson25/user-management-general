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
}
