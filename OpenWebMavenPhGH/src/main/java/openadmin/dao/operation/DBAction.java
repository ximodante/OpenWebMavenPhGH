package openadmin.dao.operation;

public enum DBAction {
	DB_CONNECT, 
	DB_DISCONNECT, 
	NEW, 
	NEW_SOME, 
	UPDATE, 
	UPDATE_SOME, 
	DELETE, 
	DELETE_SOME, 
	FIND_PK, 
	FIND_PK_SOME,
	FIND_DESC, 
	FIND_DESC_SOME,
	QUERY,
	QUERY_SOME,
	SQL, 
	SQL_SOME,
	BEGIN_TRANS, 
	COMMIT_TRANS, 
	ROLL_BACK_TRANS,
	
	
	// Other actions
}
