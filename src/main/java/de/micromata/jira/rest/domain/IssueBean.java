package de.micromata.jira.rest.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Christian
 * Date: 06.03.13
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class IssueBean extends IssueBasicBean {

    private String expand = StringUtils.EMPTY;

    private String summary = StringUtils.EMPTY;

    private IssueTypeBean issueType = null;

    private Date dueDate = null;
    
    private ProgressBean progressBean = null;

	private TimetrackingBean timetrackingBean = null;
	
	private VotesBean votesBean = null;
	
	private UserBean reporterBean = null;
	
	private Date updated = null;
	
	private Date created = null;
	
	private String description = StringUtils.EMPTY;
	
	private PriorityBean priorityBean = null;
	
	private List<IssueLinkBean> issueLinks = null;
	
	private WatchesBean watchesBean = null;
	
	private WorklogSummaryBean worklogs = null;
	
	private String timeSpent = StringUtils.EMPTY;
	
	private String aggregateTimeOriginalEstimate = StringUtils.EMPTY;
	
	private List<Integer> fixVersions = null;
	
	private Date resolutionDate = null;
	
	private ResolutionBean resolution = null;
	
	private int workratio = -1;
	
	private UserBean assigneeBean = null;
	
	private List<AttachmentBean> attachments = null;
	
	private String aggregateTimeEstimate = StringUtils.EMPTY;
	
	private ProjectBean projectBean = null;
	
	private List<VersionBean> versions = null;
	
	private String environment = StringUtils.EMPTY;
	
	private String timeestimate = StringUtils.EMPTY;
	
	private AggregateprogressBean aggregateprogressBean = null;
	
	private Date lastViewed = null;
	
	private String timeoriginalestimate = StringUtils.EMPTY;
	
	private String aggregatetimespent = StringUtils.EMPTY;
	
	private List<ComponentBean> components = null;

	private CommentSummaryBean commentSummaryBean = null;
	
    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public IssueTypeBean getIssueType() {
        return issueType;
    }

    public void setIssueType(IssueTypeBean issueType) {
        this.issueType = issueType;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

	public ProgressBean getProgress() {
		return progressBean;
	}

	public void setProgress(ProgressBean progressBean) {
		this.progressBean = progressBean;
	}

	public void setTimetracking(TimetrackingBean timetrackingBean) {
		this.timetrackingBean  = timetrackingBean;
	}

	public TimetrackingBean getTimetracking() {
		return timetrackingBean;
	}

	public VotesBean getVotes() {
		return votesBean;
	}

	public void setVotes(VotesBean votesBean) {
		this.votesBean = votesBean;
	}

	public UserBean getReporter() {
		return reporterBean;
	}

	public void setReporter(UserBean reporterBean) {
		this.reporterBean = reporterBean;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PriorityBean getPriority() {
		return priorityBean;
	}

	public void setPriority(PriorityBean priorityBean) {
		this.priorityBean = priorityBean;
	}

	public List<IssueLinkBean> getIssueLinks() {
		return issueLinks;
	}

	public void setIssueLinks(List<IssueLinkBean> issueLinks) {
		this.issueLinks = issueLinks;
	}

	public WatchesBean getWatches() {
		return watchesBean;
	}

	public void setWatches(WatchesBean watchesBean) {
		this.watchesBean = watchesBean;
	}

	public WorklogSummaryBean getWorklogs() {
		return worklogs;
	}

	public void setWorklogs(WorklogSummaryBean worklogs) {
		this.worklogs = worklogs;
	}

	public String getTimeSpent() {
		return timeSpent;
	}

	public void setTimeSpent(String timeSpent) {
		this.timeSpent = timeSpent;
	}

	public String getAggregateTimeOriginalEstimate() {
		return aggregateTimeOriginalEstimate;
	}

	public void setAggregateTimeOriginalEstimate(
			String aggregateTimeOriginalEstimate) {
		this.aggregateTimeOriginalEstimate = aggregateTimeOriginalEstimate;
	}

	public List<Integer> getFixVersions() {
		return fixVersions;
	}

	public void setFixVersions(List<Integer> fixVersions) {
		this.fixVersions = fixVersions;
	}

	public Date getResolutionDate() {
		return resolutionDate;
	}

	public void setResolutionDate(Date resolutionDate) {
		this.resolutionDate = resolutionDate;
	}

	public ResolutionBean getResolution() {
		return resolution;
	}

	public void setResolution(ResolutionBean resolution) {
		this.resolution = resolution;
	}

	public int getWorkratio() {
		return workratio;
	}

	public void setWorkratio(int workratio) {
		this.workratio = workratio;
	}

	public UserBean getAssignee() {
		return assigneeBean;
	}

	public void setAssignee(UserBean assigneeBean) {
		this.assigneeBean = assigneeBean;
	}

	public List<AttachmentBean> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<AttachmentBean> attachments) {
		this.attachments = attachments;
	}

	public String getAggregateTimeEstimate() {
		return aggregateTimeEstimate;
	}

	public void setAggregateTimeEstimate(String aggregateTimeEstimate) {
		this.aggregateTimeEstimate = aggregateTimeEstimate;
	}

	public ProjectBean getProject() {
		return projectBean;
	}

	public void setProject(ProjectBean projectBean) {
		this.projectBean = projectBean;
	}

	public List<VersionBean> getVersions() {
		return versions;
	}

	public void setVersions(List<VersionBean> versions) {
		this.versions = versions;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getTimeestimate() {
		return timeestimate;
	}

	public void setTimeestimate(String timeestimate) {
		this.timeestimate = timeestimate;
	}

	public AggregateprogressBean getAggregateprogress() {
		return aggregateprogressBean;
	}

	public void setAggregateprogress(AggregateprogressBean aggregateprogressBean) {
		this.aggregateprogressBean = aggregateprogressBean;
	}

	public Date getLastViewed() {
		return lastViewed;
	}

	public void setLastViewed(Date lastViewed) {
		this.lastViewed = lastViewed;
	}

	public List<ComponentBean> getComponents() {
		return components;
	}

	public void setComponents(List<ComponentBean> components) {
		this.components = components;
	}

	public String getTimeoriginalestimate() {
		return timeoriginalestimate;
	}

	public void setTimeoriginalestimate(String timeoriginalestimate) {
		this.timeoriginalestimate = timeoriginalestimate;
	}

	public String getAggregatetimespent() {
		return aggregatetimespent;
	}

	public void setAggregatetimespent(String aggregatetimespent) {
		this.aggregatetimespent = aggregatetimespent;
	}

	public CommentSummaryBean getComments() {
		return commentSummaryBean;
	}

	public void setComments(CommentSummaryBean commentSummaryBean) {
		this.commentSummaryBean = commentSummaryBean;
	}
}
