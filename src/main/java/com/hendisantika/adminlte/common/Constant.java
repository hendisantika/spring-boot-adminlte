package com.hendisantika.adminlte.common;



/**
 * @author SwanHtetKyaw
 *
 */

public class Constant {
	private Constant() {
		// do nothing
	}
	// constant data section

	public static final String ADMIN_ROLE_PREFIX = "ROLE_ADMIN";
	public static final String USER_ROLE = "ROLE_USER";
	public static final String ROLE_ADMIN = "ADMIN";

	public static final String DISABLE_USER_TEXT = "* This account is disabled.";
	public static final String USER_NOT_FOUND_TEXT = "* Could not find your account";
	public static final String LDAP_COMMUNICATION_ERROR_TEXT = "* Please contact your admin.";
	public static final String LDAP_COMMUNICATION_ERROR_LOG_TEXT = "Communication exception error occured in retrieving LDAP DB";

	public static String FORM_USER_NAME = "";

	

	public static final int DESCRIPTION_MAX_SIZE = 255;

	// account type constants
	public static final String SEARCH_ACCOUNT_REF = "accountType";
	public static final String SEARCH_APP_END_REF = "applicationEndDate";
	public static final String SEARCH_APP_START_REF = "applicationStartDate";
	public static final String SEARCH_CLIENT_NAME_REF = "clientName";
	public static final String SEARCH_CLIENT_NRIC_REF = "clientNRC";
	public static final String SEARCH_TASK_STATE = "taskState";
	public static final String[] SEARCH_ACCOUNT_TYPES = new String[] { "cashAcctTypeBroker", "cashAcctTypeOnline",
			"marginAcctBroker", "marginAcctOnline", "cfdAcct", "cctAcct", "existingCash" };

	// module other name
	public static final String OTHER_MODULE = "OTHER";
	public static final String PENDING_TR_TAB = "PENDING_TR_TAB";
	public static final String PENDING_TR_TAB_DESC = "Pending TR Tab";
	public static final String DRAFT_APP_TAB = "DRAFT_APP_TAB";
	public static final String DRAFT_APP_TAB_DESC = "Draft Applications Tab";
	public static final String STATUS_TAB = "STATUS_TAB";
	public static final String STATUS_TAB_DESC = "Status Tab";
	public static final String CHECKLIST_TAB = "CHECKLIST_TAB";
	public static final String CHECKLIST_TAB_DESC = "Checklist Tab";
	public static final String APPLICATION_TAB = "APPLICATION_TAB";
	public static final String APPLICATION_TAB_DESC = "Application Tab";
	public static final String ATTACHMENT_TAB = "ATTACHMENT_TAB";
	public static final String ATTACHMENT_TAB_DESC = "Attachment Tab";
	public static final String CREDIT_TAB = "CREDIT_TAB";
	public static final String CREDIT_TAB_DESC = "Credit Tab";
	public static final String LIMIT_TAB = "LIMIT_TAB";
	public static final String LIMIT_TAB_DESC = "Limit Tab";

	// module type names
	public static final String PENDING_TR_CEO = "PENDING_TR_CEO";
	public static final String PENDING_TR_BEFORE_CO_LEVEL = "PENDING_TR_BEFORE_CO_LEVEL";
	public static final String PENDING_TR_AFTER_CO_LEVEL = "PENDING_TR_AFTER_CO_LEVEL";

	public static final String DRAFT_CEO = "DRAFT_CEO";
	public static final String DRAFT_BEFORE_TR_LEVEL = "DRAFT_BEFORE_TR_LEVEL";
	public static final String DRAFT_CSO_LEVEL = "DRAFT_CSO_LEVEL";
	public static final String DRAFT_AFTER_TR_LEVEL = "DRAFT_AFTER_TR_LEVEL";

	public static final String STATUS_READ_ONLY = "STATUS_READ_ONLY";

	public static final String CHECKLIST_CEO = "CHECKLIST_CEO";
	public static final String CHECKLIST_BEFORE_TR = "CHECKLIST_BEFORE_TR";
	public static final String CHECKLIST_TR = "CHECKLIST_TR";
	public static final String CHECKLIST_AFTER_TR = "CHECKLIST_AFTER_TR";

	public static final String APP_CEO = "APP_CEO";
	public static final String APP_BEFORE_TR_LEVEL = "APP_BEFORE_TR_LEVEL";
	public static final String APP_AFTER_TR_LEVEL = "APP_AFTER_TR_LEVEL";

	public static final String ATTACH_CEO = "ATTACH_CEO";
	public static final String ATTACH_TR = "ATTACH_TR";
	public static final String ATTACH_OTHER = "ATTACH_OTHER";

	public static final String CREDIT_CEO = "CREDIT_CEO";
	public static final String CREDIT_BEFORE_TR_LEVEL = "CREDIT_BEFORE_TR_LEVEL";
	public static final String CREDIT_TR = "CREDIT_TR";
	public static final String CREDIT_AFTER_TR_LEVEL = "CREDIT_AFTER_TR_LEVEL";

	public static final String LIMIT_CEO = "LIMIT_CEO";

	// General setting data section

	public static final String ORBEON_RETRIEVE_CATEGORY = "Orbeon Retrieve";

	public static final String ORBEON_SERVER_NAME = "Orbeon Server Name";
	public static final String ORBEON_APP_NAME = "Orbeon App Name";
	public static final String ORBEON_FORM_NAME = "Orbeon Form Name";
	public static final String ORBEON_CREATE_NEW_URL = "Orbeon Create New URL";

	public static final String ORBEON_SCHEDULE_GROUP = "Orbeon Failed Scheduler";
	public static final String ORBEON_SCHEDULE_TIME = "Orbeon Failed Scheduler Time";
	public static final String ORBEON_SCHEDULE_STATUS = "Enable Orbeon Failed Scheduler";

	public static final String ORBEON_DRAFT_SCHEDULE_GROUP = "Orbeon Draft Scheduler";
	public static final String ORBEON_DRAFT_SCHEDULE_TIME = "Orbeon Draft Scheduler Time";
	public static final String ORBEON_DRAFT_SCHEDULE_DAY = "Orbeon Draft Scheduler Day";
	public static final String ORBEON_DRAFT_SCHEDULE_STATUS = "Enable Orbeon Draft Scheduler";

	public static final String ORBEON_CRATEDURL_OFFICE = "Orbeon Form Name Office";

	public static final String SMBJ_FILE_CATEGORY = "SMBJ File Upload";

	public static final String SMBJ_SO_TIMEOUT = "SMBJ SO Timeout";
	public static final String SMBJ_SESSION_TIMEOUT = "SMBJ Session Timeout";
	public static final String SMBJ_SERVER_NAME = "SMBJ Server Name";
	public static final String SMBJ_SHARED_NAME = "SMBJ Shared Name";
	public static final String SMBJ_DOMAIN_NAME = "SMBJ Domain Name";
	public static final String SMBJ_PW = "SMBJ Password";
	public static final String SMBJ_USER_NAME = "SMBJ User Name";
	public static final String SMBJ_DESTI_FOLDER_NAME = "SMBJ Destination Folder Name";
	public static final String SMBJ_FOLDER_DIR_LVL = "SMBJ Folder Directory Level";
	public static final String SMBJ_NO_OF_FOLDER = "SMBJ Number of Folder";
	public static final String SMBJ_CURRENT_FOLDER_NAME = "SMBJ Current Folder Name";

	public static final String ACTIVITY_CATEGORY = "Activiti Category";

	public static final String ACTIVITY_CATEGORY_URL = "Activiti URL";
	public static final String ACTIVITY_CATEGORY_PROCESS_DEF_ID = "Activiti Process Definition ID";
	public static final String ACTIVITY_CATEGORY_USERNAME = "Activiti Username";
	public static final String ACTIVITY_CATEGORY_PW = "Activiti Password";
	public static final String ACTIVITY_CATEGORY_EMAIL_SCHEDULE_GROUP = "Activiti Email Schedule";
	// this email schedule group is not stored in DB and will only use to
	// combine the email schedule setting into one setting in UI
	public static final String ACTIVITY_CATEGORY_EMAIL_SCHEDULE = "Activiti Email Scheduled Time(hh:mm)";
	public static final String ACTIVITY_CATEGORY_EMAIL_SCHEDULE_STATUS = "Enable Activiti Email Schedule";

	public static final String CM_SERVER_CATEGORY = "CM Server Upload";

	public static final String CM_SERVER_DB = "CM Server Database";
	public static final String CM_SERVER_USERNAME = "CM Server Username";
	public static final String CM_SERVER_PW = "CM Server Password";
	public static final String CM_SERVER_SCHEMA = "CM Server Schema";

	public static final String TR_EMAIL_CATEGORY = "Email Setting for TR";

	public static final String TR_EMAIL_HOST = "Host";
	public static final String TR_EMAIL_FROM = "From";
	public static final String TR_EMAIL_PW = "Password";
	public static final String TR_EMAIL_PORT = "Port";
	public static final String TR_EMAIL_SMTP_STARTLE_EN = "SMTP Startle Enabled";
	public static final String TR_EMAIL_AUTH = "Auth";
	public static final String TR_EMAIL_TRANSPORT = "Transport";
	public static final String TR_EMAIL_TITLE = "Email Title (Pending)";
	public static final String TR_EMAIL_BODY = "Email Body (Pending)";
	public static final String TR_EMAIL_TITLE_COMPLETED = "Email Title (Completed)";
	public static final String TR_EMAIL_BODY_COMPLETED = "Email Body (Completed)";
	public static final String TR_EMAIL_PENDING_TASK_URL = "Pending Task URL";
	public static final String TR_EMAIL_SENDER_NAME = "Email sender name";


	// LDAP credentials
	public static final String LDAP_CATEGORY = "LDAP Credentials";

	public static final String LDAP_URL = "LDAP Url";
	public static final String LDAP_BASEDN = "LDAP Basedn";
	public static final String LDAP_PREFIX = "LDAP Prefix";
	public static final String LDAP_PREFIX_LABLE = "Domain Prefix";
	public static final String LDAP_USER_NAME = "LDAP User Name";
	public static final String LDAP_PW = "LDAP Password";

	public static final String SEARCH_TERMINATED = "TERMINATED";

	public static final String[] EMPTYABLE_SETTING_KEYS = new String[] { LDAP_PREFIX,
			ACTIVITY_CATEGORY_EMAIL_SCHEDULE_GROUP, ORBEON_SCHEDULE_GROUP, ORBEON_DRAFT_SCHEDULE_GROUP };

	public static final String[] EXCEPT_SETTING_KEYS = new String[] { ORBEON_SCHEDULE_GROUP,
			ORBEON_DRAFT_SCHEDULE_GROUP, SMBJ_PW, ACTIVITY_CATEGORY_PW, ACTIVITY_CATEGORY_EMAIL_SCHEDULE_GROUP,
			CM_SERVER_PW, TR_EMAIL_PW, LDAP_PW };
	// general setting url

	public static final String URL_CATEGORY = "General Setting for URL";

	public static final String DELIQUENT_URL = "Deliquent";
	public static final String INDIVIDUAL_ACCOUNT_URL = "Individual";
	public static final String MANDATE_URL = "Mandate";
	public static final String CM_URL = "Cm";

	// For MyInfo Category setting

	public static final String MY_INFO_CATEGORY = "My Info ";

	public static final String REDIRECT_URL = "Redirect URL";
	public static final String CLIENT_ID = "Client Id";
	public static final String CLIENT_SECRET = "Client Secret";
	public static final String REALM = "Realm";
	public static final String TOKENAPIURL = "Tokenapi URL";
	public static final String PERSONAPIURL = "Personapi URL";

	public static final String AOUTHAPIURL = "Aouthapi URL";
	public static final String ATTRIBUTES = "Attributes";
	public static final String PURPOSE = "Purpose";

	// Client Settings
	public static final String CLIENT_REST_CATEGOTRY = "Client Setting";
	public static final String CLIENT_REST_URL = "Client Rest Url";
	public static final String CLIENT_APPFORM_CDP_URL = "Client Appform CDP url";
	public static final String CLIENT_SUPPORT_DOC_URL = "Supporting Document URL";
	public static final String CLIENT_FILE_UPLOAD_LIMIT = "Client File upload size limit";


	// Role access functionality
	public static final String TERMINATED_REF = "terminate";
	public static final String APPROVE_REF = "approve";
	public static final String REJECT_REF = "reject";
	public static final String CLAIM_REF = "claim";
	public static final String UNCLAIM_REF = "unclaim";
	public static final String SAVE_REF = "save";
	public static final String CANCEL_REF = "cancel";

	// ## activiti variable name references
	public static final String NRIC_REF = "apptNric";
	public static final String PASSPORT_REF = "apptpassport";
	public static final String[] USER_UNIQUE_KEY_REFERENCES = new String[] { NRIC_REF, PASSPORT_REF };
	// ## activiti variable name references

	// message data section

	public static final String MSG_ROLE_NAME_EMPTY = "* Role name cannot be empty";
	public static final String MSG_ROLE_NAME_UNIQUE = "* Role name already exist";
	public static final String MSG_ROLE_NAME_ADMIN = "* Admin keyword is a reserve keyword for role name. Plz change the role name to other";
	public static final String MSG_ROLE_ADMIN = "* You cannot create or update any admin level role";
	public static final String MSG_ROLE_ACCESS_REQUIRED = "* Access level for all 7 access area must be defined for a role";

	public static final String MSG_DEPT_NAME_EMPTY = "* Department name cannot be empty";
	public static final String MSG_DEPT_NAME_UNIQUE = "* Department name already exist";

	public static final String MSG_DESCRIPTION_MAX_SIZE = "* Description size cannot be more than 255";

	public static final String MSG_ATTACHMENT_NAME_EMPTY = "* Attachment name cannot be empty";
	public static final String MSG_ATTACHMENT_NAME_UNIQUE = "* Attachment name already exist";

	public static final String MSG_CMITEMTYPE_NAME_EMPTY = "* CM Itemtype name cannot be empty";
	public static final String MSG_CMITEMTYPE_NAME_UNIQUE = "* CM Itemtype name already exist";
	
	public static final String MSG_FORM_REF_ID_EMPTY = "* Form reference ID cannot be empty";
	public static final String MSG_FORM_REF_ID_UNIQUE = "* Form reference ID already exist";
	
	public static final String MSG_FORM_NAME_EMPTY = "* Form name cannot be empty";
	
	public static final String MSG_FORM_URL_EMPTY = "* Form url cannot be empty";
	public static final String MSG_FORM_URL_REAL = "* Form url is not valid";
	
	public static final String MSG_MODEL_NAME_EMPTY = "* Activiti model name cannot be empty";
	public static final String MSG_MODEL_UNIQUE = "* Activiti model name, task code and task id must be unique";

	public static final String MSG_ROLE_DELETE_ERROR = "* This role can\'t be deleted since it has a relation with some user or department";
	public static final String MSG_DEPT_DELETE_ERROR = "* This department can\'t be deleted since it has a relation with some user or role";
	public static final String MSG_ATTACH_DELETE_ERROR = "* This attachment can\'t be deleted since it has a relation with some user";

	public static final String MSG_USERNAME_EMPTY = "* Username cannot be empty";
	public static final String MSG_USERNAME_UNIQUE = "* Username already exist";
	public static final String MSG_EMAIL_UNIQUE = "* Email already exist";
	public static final String MSG_TRCODE_UNIQUE = "* TRCode already exist";

	public static final String MSG_PW_NOT_MATCH = "* Current password is wrong";

	public static final String MSG_GS_CATEGORY_EMPTY = "* Category name cannot be empty";
	public static final String MSG_GS_KEY_EMPTY = "* Key name cannot be empty";
	public static final String MSG_GS_VALUE_EMPTY = "* Value cannot be empty";

	public static final String MSG_ROLE_LIST_EMPTY = "* A user must have at least one role";

	public static final String MSG_SETTING_VALUE_EMPTY = "* General Setting value cannot be empty";

	public static final String MSG_BLOCK_NAME_EMPTY = "* Form Section name cannot be empty";

	public static final String MSG_MODULE_NAME_EMPTY = "* Form Tab name cannot be empty";
	public static final String MSG_MODULE_NAME_UNIQUE = "* Form Tab name must be unique";

	public static final String MSG_BLOCK_DELETE_ERROR = "* This form section can\'t be deleted since it has a relation with some form tabs";
	public static final String MSG_BLOCK_NAME_UNIQUE = "* Form Section name already exist";

	public static final String MSG_MODULE_DELETE_ERROR = "* This form tab can\'t be deleted since it has a relation with some Form Section and roles";
	
	public static final String MSG_GENERAL_SETTING_FILE_SIZE_ERROR = "* General Setting file upload size must be a number";


}
