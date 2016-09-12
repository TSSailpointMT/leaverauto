package com.ts.leaver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ts.commons.Validator;
import com.ts.leaver.testcases.MyProjTestCaseUtils;
import com.ts.leaver.utils.UI;

import org.junit.Assert;

public class HomePage extends SystemPage{

	//======== Left SubMenu Items ====================================================================
		@FindBy(xpath= ".//*[@id='quicklinkButton']")
		private WebElement subMenuLeft;
		
		//******** Dashboard Section *********************************************************************
		@FindBy(xpath= ".//*[@id='quicklinkList']/descendant::li[starts-with(normalize-space(.),'Dashboard')]")
		private WebElement dashboards;
		
		@FindBy(xpath= ".//a[contains(.,'My Dashboard')]")
		private WebElement myDashboard;
		
		@FindBy(xpath= ".//a[contains(.,'Compliance Dashboard')]")
		private WebElement complianceDashboard;
		
		@FindBy(xpath= ".//a[contains(.,'Lifecycle Dashboard')]")
		private WebElement lifeCycleDashboard;
		
		
		//******** My Tasks Section***********************************************************************
		@FindBy(xpath= ".//*[@id='quickLinkCategoryTasks']")
		private WebElement myTasks;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Access Reviews')]")
		private WebElement accessReviews;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'My Tasks')]/descendant::a[starts-with(normalize-space(.),'Approvals')]")
		private WebElement approvals;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'My Tasks')]/descendant::a[starts-with(normalize-space(.),'Forms')]")
		private WebElement forms;
		
		@FindBy(xpath= ".//a[contains(.,'Sign-off')]")
		private WebElement signOffReports;
		
		@FindBy(xpath= ".//a[contains(.,'Notifications')]")
		private WebElement notifications;
		
		@FindBy (xpath =".//descendant::li[starts-with(normalize-space(.),'My Tasks')]/descendant::a[starts-with(normalize-space(.),'Policy Violations')]")
		private WebElement policyViolationsLeftMenu;
		
		@FindBy (xpath =".//a[contains(.,'Request Violations')]")
		private WebElement requestViolations;
		
		
		//******** Manage Access Section******************************************************************
		@FindBy(xpath= ".//*[@id='quickLinkCategoryAccess']")
		private WebElement manageAccess;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Manage User Access')]")
		private WebElement manageUserAccess;
		
		@FindBy(xpath= ".//a[contains(.,'Manage Accounts')]")
		private WebElement manageAccounts;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Manage Accounts')]/descendant::a[starts-with(normalize-space(.),'For Me')]")
		private WebElement manageAccountsForMe;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Manage Accounts')]/descendant::a[starts-with(normalize-space(.),'For Others')]")
		private WebElement manageAccountsForOthers;
		
		@FindBy(xpath= ".//a[contains(.,'Change Passwords')]")
		private WebElement changePasswords;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Change Passwords')]/descendant::a[starts-with(normalize-space(.),'For Me')]")
		private WebElement changePasswordsForMe;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Change Passwords')]/descendant::a[starts-with(normalize-space(.),'For Others')]")
		private WebElement changePasswordsForOthers;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Track My Requests')]")
		private WebElement trackMyRequests;
		//******** Manage Identity Section*****************************************************************
		@FindBy(xpath= ".//*[@id='quickLinkCategoryManage']")
		private WebElement manageIdentity;
		
		@FindBy(xpath= ".//a[contains(.,'Create Contractor')]")
		private WebElement createContractorLink;
		
		@FindBy(xpath= ".//a[contains(.,'Terminate a User')]")
		private WebElement terminateUserLink;
		
		@FindBy(xpath= ".//a[contains(.,'Edit Identity')]")
		private WebElement editIdentityLink;
		
		@FindBy(xpath= ".//a[contains(.,'Contractor to Employee Transfer')]")
		private WebElement contractorToEmployeeLink;
		
		@FindBy(xpath= ".//a[contains(.,'Manual Re')]")
		private WebElement manualRenableLink;
		
		@FindBy(xpath= ".//a[contains(.,'Transfer Request Form')]")
		private WebElement transferRequestLink;
		
		@FindBy(xpath= ".//a[contains(.,'View Identity')]")
		private WebElement viewIdentityLink;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'View Identity')]/descendant::a[starts-with(normalize-space(.),'For Me')]")
		private WebElement viewIdentityforMeLink;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'View Identity')]/descendant::a[starts-with(normalize-space(.),'For Others')]")
		private WebElement viewIdentityforOthersLink;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Edit Identity')]/descendant::a[starts-with(normalize-space(.),'For Me')]")
		private WebElement editIdentityforMeLink;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'Edid Identity')]/descendant::a[starts-with(normalize-space(.),'For Others')]")
		private WebElement editIdentityforOthersLink;
		
		//======== Bar Menu Items =========================================================================
		@FindBy(xpath= ".//a[contains(.,'Home')]")
		private WebElement barMenuHome;
		
		//******** My Work Section*************************************************************************
		@FindBy(xpath= ".//a[contains(.,'My Work')]")
		private WebElement barMenuMyWork;
		
		@FindBy(xpath= ".//a[contains(.,'My Access Review')]")
		private WebElement barMenuMyAccessReview;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'My Work')]/descendant::a[starts-with(normalize-space(.),'Access Request')]")
		private WebElement barMenuAccessRequests;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'My Work')]/descendant::a[starts-with(normalize-space(.),'Policy Violations')]")
		private WebElement barMenuPolicyViolationsMenuBar;
		
		@FindBy(xpath= ".//descendant::li[starts-with(normalize-space(.),'My Work')]/descendant::a[starts-with(normalize-space(.),'Work Items')]")
		private WebElement barMenuWorkItems;
		//******** Identities Section**********************************************************************
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Identities')]")
		private WebElement barMenuIdentities;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Identity Warehouse')]")
		private WebElement barMenuIdentityWarehouse;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Identity Correlation')]")
		private WebElement barMenuIdentityCorrelation; 
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Identity Risk Model')]")
		private WebElement barMenuIdentityRiskModel; 
		//******** Application Section*********************************************************************
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Applications')]")
		private WebElement barMenuApplications;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Application Definition')]")
		private WebElement barMenuApplicationDefinition;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Entitlement Catalog')]")
		private WebElement barMenuEntitlementCatalog;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Application Risk Model')]")
		private WebElement barMenuApplicationRiskModel;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Activity Target Categories')]")
		private WebElement barMenuActivityTargetCategories;
		//******** Intelligence Section********************************************************************
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Intelligence')]")
		private WebElement barMenuIntelligence;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Advanced Analytics')]")
		private WebElement barMenuAdvanceAnalitycs;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Reports')]")
		private WebElement barMenuReports;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Identity Risk Scores')]")
		private WebElement barMenuIdentityRiskScores;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Application Risk Scores')]")
		private WebElement barMenuApplicationRiskScores;
		//******** Setup Section***************************************************************************
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Setup')]")
		private WebElement barMenuSetup;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Certifications')]")
		private WebElement barMenuCertifications;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Roles')]")
		private WebElement barMenuRoles;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Policies')]")
		private WebElement barMenuPolicies;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Tasks')]")
		private WebElement barMenuTasks;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Groups')]")
		private WebElement barMenuGroups;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Business Processes')]")
		private WebElement barMenuBusinessProcesses;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Lifecycle Events')]")
		private WebElement barMenuLifecycleEvents;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Batch Requests')]")
		private WebElement barMenuBatchRequests;
		//******** Configuration Section*******************************************************************
		@FindBy(xpath= ".//li[@class='dropdown'][1]")
		private WebElement barMenuConfigurationIcon;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Global Settings')]")
		private WebElement barMenuGlobalSettings;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Lifecycle Manager')]")
		private WebElement barMenuLifecycleManager;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Compliance Manager')]")
		private WebElement barMenuComplianceManager;
		//******** Alert Section***************************************************************************
		@FindBy(xpath= ".//*[@id='notificationMenuItemLink']")
		private WebElement barMenuAlerts;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Approvals')]")
		private WebElement barMenuApprovals;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Forms')]")
		private WebElement barMenuForms;
		
		@FindBy(xpath= ".//*[@id='notificationMenuItem']/descendant::a[contains(.,'Violations')]")
		private WebElement barMenuViolations;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Others')]")
		private WebElement barMenuOthers;
		//******** User Section****************************************************************************
		@FindBy(xpath= ".//li[@class='dropdown'][@role]")
		private WebElement barMenuUser;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Preferences')]")
		private WebElement barMenuPreferences;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Help')]")
		private WebElement barMenuHelp;
		
		@FindBy(xpath= ".//a[@role='menuitem'][contains(.,'Logout')]")
		private WebElement barMenuLogout;
		//TODO
//		____________*/)__________ 
//		___________*/.|__________ 
//		__________*/..|__________ 
//		_________*(___)___________ 
//		___________|_|____________ 
//		___________|_|____________ 
//		___________|=|____________ 
//		___________|=|____________ 
//		___________|=|____________ 
//		___________|=|____________ 
//		___________|=|____________ 
//		______/#|___|=|___/________ 
//		_____(##(__..|=|__)#)_______ 
//		_____###/__|=|_/###/_______ 
//		______##)#____.##(_________ 
//		______ )#/#____####_______ 
//		______/#|##____####______ 
//		_____(##___###.####)______ 
//		______(############)_______ 
//		_______(##########)________ 

		
		//Metodos para el manejo de la homepage
		public HomePage clickLeftSubMenu() {
			subMenuLeft.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		//***********************************************************
		public HomePage clickDasboard() {
			dashboards.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public MyDashboardPage clickMyDasboard(UI ui) {
			myDashboard.click();
			MyDashboardPage page = new MyDashboardPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), MyDashboardPage.class);
			page.and(ui);
			return page;
		}
		
		public ComplianceDashboardPage clickComplianceDasboard(UI ui) {
			complianceDashboard.click();
			ComplianceDashboardPage page = new ComplianceDashboardPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), ComplianceDashboardPage.class);
			page.and(ui);
			return page;
		}
		
		public LifecycleDashboardPage clickLifeCycleDasboard(UI ui) {
			lifeCycleDashboard.click();
			LifecycleDashboardPage page = new LifecycleDashboardPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), LifecycleDashboardPage.class);
			page.and(ui);
			return page;
		}
		//***********************************************************
		public HomePage clickMyTasks() {
			myTasks.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public AccessReviewsPage clickAccessReviewMyTasks(UI ui) {
			accessReviews.click();
			AccessReviewsPage page = new AccessReviewsPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), AccessReviewsPage.class);
			page.and(ui);
			return page;
		}
		
		public ApprovalsPage clickApprovalsMyTasks(UI ui) {
			approvals.click();
			ApprovalsPage page = new ApprovalsPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), ApprovalsPage.class);
			page.and(ui);
			return page;
		}
		
		public FormsPage clickFormsMyTasks(UI ui) {
			forms.click();
			FormsPage page = new FormsPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), FormsPage.class);
			page.and(ui);
			return page;
		}
		
		public SignoffReportsPage clickSignOffReportsMyTasks(UI ui) {
			signOffReports.click();
			SignoffReportsPage page = new SignoffReportsPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), SignoffReportsPage.class);
			page.and(ui);
			return page;
		}
		
		public NotificationsPage clickNotificationsMyTasks(UI ui) {
			notifications.click();
			NotificationsPage page = new NotificationsPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), NotificationsPage.class);
			page.and(ui);
			return page;
		}
		
		public PolicyViolationsPage clickPolicyViolationsMyTasks(UI ui) {
			policyViolationsLeftMenu.click();
			PolicyViolationsPage page = new PolicyViolationsPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), PolicyViolationsPage.class);
			page.and(ui);
			return page;
		}
		
		public HomePage clickReaquestViolationsMyTasks() {
			requestViolations.click();
			
			return this;
		}
		//***********************************************************
		public HomePage clickManageAccess(){
			manageAccess.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}

		public HomePage clickManageUserAccessManageAccess(){
			manageUserAccess.click();
			return this;
		}
		
		public HomePage clickManageAccountsManageAccess(){
			manageAccounts.click();
			return this;
		}
		
		public HomePage clickManageAccountsForMeManageAccess(){
			manageAccountsForMe.click();
			return this;
		}
		
		public HomePage clickManageAccountsForOthersManageAccess(){
			manageAccountsForOthers.click();
			return this;
		}
		
		public HomePage clickChangePasswordsManageAccess(){
			changePasswords.click();
			return this;
		}
		
		public HomePage clickChangePasswordsForMeManageAccess(){
			changePasswordsForMe.click();
			return this;
		}
		
		public HomePage clickChangePasswordsForOthersManageAccess(){
			changePasswordsForOthers.click();
			return this;
		}
		
		public HomePage clickTrackMyRequestsManageAccess(){
			trackMyRequests.click();
			return this;
		}
		
		//***********************************************************
		public HomePage clickManageIdentity() {
			manageIdentity.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage clickCretaeContractor() {
			createContractorLink.click();
			return this;
		}
		
		public HomePage clickTerminateUser() {
			terminateUserLink.click();
			return this;
		}
		
		public HomePage clickEditIdentity() {
			editIdentityLink.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage editEntityclickForMe() {
			editIdentityforMeLink.click();
			return this;
		}
		
		public HomePage editEntityclickForOthers() {
			editIdentityforOthersLink.click();
			return this;
		}
		
		public HomePage clickContractorToEmployee() {
			contractorToEmployeeLink.click();
			return this;
		}
		
		public HomePage clickManualRe_Enable() {
			manualRenableLink.click();
			return this;
		}
		
		public HomePage clickTransferRequest() {
			transferRequestLink.click();
			return this;
		}
		
		public HomePage clickViewIdentity() {
			viewIdentityLink.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage viewIdentityClickForMe() {
			viewIdentityforMeLink.click();
			return this;
		}
		
		public HomePage viewIdentityClickForOthers() {
			viewIdentityforOthersLink.click();
			return this;
		}
		//============================================================
		public HomePage clickHomeLink(){
			barMenuHome.click();
			return this;
		}
		//============================================================
		public HomePage clickMyWorkLinkMenuBar(){
			barMenuMyWork.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage clickMyAccesReviewsMenuBar(){
			barMenuMyAccessReview.click();
			return this;
		}
		
		public HomePage clickAccessRequestLinkMenuBar(){
			barMenuAccessRequests.click();
			return this;
		}
		
		public HomePage clickPolicyViolationsLinkMenuBar(){
			barMenuPolicyViolationsMenuBar.click();
			return this;
		}
		
		public HomePage clickWorkItemsMenuBar(){
			barMenuWorkItems.click();
			return this;
		}
		//=====================================================================================
		public HomePage clickIdentitiesLinkMenuBar(){
			barMenuIdentities.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage clickIdentityWarehouseLinkMenuBar(){
			barMenuIdentityWarehouse.click();
			return this;
		}
		
		public HomePage clickIdentityCorrelationLinkMenuBar(){
			barMenuIdentityCorrelation.click();
			return this;
		}
		
		public HomePage clickIdentityRisckModelLinkMenuBar(){
			barMenuIdentityRiskModel.click();
			return this;
		}
		//=====================================================================================
		public HomePage clickApplicationsLinkMenuBar(){
			barMenuApplications.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public ApplicationDefinitionPage clickApplicationDefinitionLinkMenuBar(UI ui){
			barMenuApplicationDefinition.click();
			ApplicationDefinitionPage page = new ApplicationDefinitionPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), ApplicationDefinitionPage.class);
			page.and(ui);
			return page;
		}
		
		public HomePage clickEntitlementCatalogLinkMenuBar(){
			barMenuEntitlementCatalog.click();
			return this;
		}
		
		public HomePage clickAppliocationRiskModelLinkMenuBar(){
			barMenuApplicationRiskModel.click();
			return this;
		}
		
		public HomePage clickActivityTargetCategoriesLinkMenuBar(){
			barMenuActivityTargetCategories.click();
			return this;
		}
		//=====================================================================================
		public HomePage clickIntelligenceMenuBar(){
			barMenuIntelligence.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage clickAdvancedAnalyticsMenuBar(){
			barMenuReports.click();
			return this;
		}
		
		public HomePage clickReportsMenuBar(){
			barMenuAdvanceAnalitycs.click();
			return this;
		}
		
		public HomePage clickIdentityRiskScoresMenuBar(){
			barMenuIdentityRiskScores.click();
			return this;
		}
		
		public HomePage clickApplicationRiskScoresMenuBar(){
			barMenuApplicationRiskScores.click();
			return this;
		}
		//=====================================================================================
		public HomePage clickSetupLinkMenuBar(){
			barMenuSetup.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage clickCertificactionsMenuBar(){
			barMenuCertifications.click();
			return this;
		}
		
		public HomePage clickRolesMenuBar(){
			barMenuRoles.click();
			return this;
		}
		
		public HomePage clickPoliciesMenuBar(){
			barMenuPolicies.click();
			return this;
		}
		
		public TasksPage clickTasksMenuBar(UI ui){
			barMenuTasks.click();
			TasksPage page = new TasksPage();
			page = PageFactory.initElements((WebDriver) ui.getDriver(), TasksPage.class);
			page.and(ui);
			return page;
		}
		
		public HomePage clickGroupsMenuBar(){
			barMenuGroups.click();
			return this;
		}
		
		public HomePage clickBusinessProcessesMenuBar(){
			barMenuBusinessProcesses.click();
			return this;
		}
		
		public HomePage clickLifecycleEventsMenuBar(){
			barMenuLifecycleEvents.click();
			return this;
		}
		
		public HomePage clickBatchRequestsMenuBar(){
			barMenuBatchRequests.click();
			return this;
		}
		//=====================================================================================
		public HomePage clickConfigurationIconMenuBar(){
			barMenuConfigurationIcon.click();
			MyProjTestCaseUtils.sleep(3);
			return this;
		}
		
		public HomePage clickGlobalSettingsMenuBar(){
			barMenuGlobalSettings.click();
			return this;
		}
		
		public HomePage clickLifecycleManagerMenuBar(){
			barMenuLifecycleManager.click();
			return this;
		}
		
		public HomePage clickComplianceManagerMenuBar(){
			barMenuComplianceManager.click();
			return this;
		}
		//=====================================================================================
		public HomePage clickAlertsMenuBar(){
			barMenuAlerts.click();
			MyProjTestCaseUtils.sleep(1);
			return this;
		}
		
		public HomePage clickApprovalsMenuBar(){
			barMenuApprovals.click();
			return this;
		}
		
		public HomePage clickFormsMenuBar(){
			barMenuForms.click();
			return this;
		}
		
		public HomePage clickViolationsMenuBar(){
			barMenuViolations.click();
			return this;
		}
		
		public HomePage clickOthersMenuBar(){
			barMenuOthers.click();
			return this;
		}
		//=====================================================================================
		public HomePage clickUserMenuBar(){
			barMenuUser.click();
			MyProjTestCaseUtils.sleep(1);
			return this;
		}
		
		public HomePage clickPreferencesMenuBar(){
			barMenuPreferences.click();
			return this;
		}
		
		public HomePage clickHelpMenuBar(){
			barMenuHelp.click();
			return this;
		}
		
		public HomePage clickLogoutMenuBar(){
			barMenuLogout.click();
			return this;
		}
		//TODO
		//=====================================================================================

	@Override
	public HomePage and() {
		return this;
	}

	public HomePage and(UI uiInstance) {
		this.uiInstance = uiInstance;
		return this;
	}

	@Override
	public HomePage then() {
		return this;
	}

	// ###### Validators
	public Validator validateWelcome() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath("//descendant::span[starts-with(normalize-space(.),'Home')]"))
							.getText().trim(), "Home");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}

}
