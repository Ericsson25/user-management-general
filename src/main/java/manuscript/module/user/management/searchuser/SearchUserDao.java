package manuscript.module.user.management.searchuser;

import java.util.List;

import manuscript.module.user.management.bean.SearchUser;
import manuscript.module.user.management.bean.User;

public interface SearchUserDao {

	public List<User> searchUsers(SearchUser searchUser);
}
