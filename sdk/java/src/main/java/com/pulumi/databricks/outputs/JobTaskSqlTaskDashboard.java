// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskSqlTaskDashboardSubscription;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskSqlTaskDashboard {
    /**
     * @return string specifying a custom subject of email sent.
     * 
     */
    private @Nullable String customSubject;
    /**
     * @return (String) identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    private String dashboardId;
    /**
     * @return flag that specifies if subscriptions are paused or not.
     * 
     */
    private @Nullable Boolean pauseSubscriptions;
    /**
     * @return a list of subscription blocks consisting out of one of the required fields: `user_name` for user emails or `destination_id` - for Alert destination&#39;s identifier.
     * 
     */
    private @Nullable List<JobTaskSqlTaskDashboardSubscription> subscriptions;

    private JobTaskSqlTaskDashboard() {}
    /**
     * @return string specifying a custom subject of email sent.
     * 
     */
    public Optional<String> customSubject() {
        return Optional.ofNullable(this.customSubject);
    }
    /**
     * @return (String) identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    public String dashboardId() {
        return this.dashboardId;
    }
    /**
     * @return flag that specifies if subscriptions are paused or not.
     * 
     */
    public Optional<Boolean> pauseSubscriptions() {
        return Optional.ofNullable(this.pauseSubscriptions);
    }
    /**
     * @return a list of subscription blocks consisting out of one of the required fields: `user_name` for user emails or `destination_id` - for Alert destination&#39;s identifier.
     * 
     */
    public List<JobTaskSqlTaskDashboardSubscription> subscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskSqlTaskDashboard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customSubject;
        private String dashboardId;
        private @Nullable Boolean pauseSubscriptions;
        private @Nullable List<JobTaskSqlTaskDashboardSubscription> subscriptions;
        public Builder() {}
        public Builder(JobTaskSqlTaskDashboard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSubject = defaults.customSubject;
    	      this.dashboardId = defaults.dashboardId;
    	      this.pauseSubscriptions = defaults.pauseSubscriptions;
    	      this.subscriptions = defaults.subscriptions;
        }

        @CustomType.Setter
        public Builder customSubject(@Nullable String customSubject) {
            this.customSubject = customSubject;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardId(String dashboardId) {
            this.dashboardId = Objects.requireNonNull(dashboardId);
            return this;
        }
        @CustomType.Setter
        public Builder pauseSubscriptions(@Nullable Boolean pauseSubscriptions) {
            this.pauseSubscriptions = pauseSubscriptions;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptions(@Nullable List<JobTaskSqlTaskDashboardSubscription> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(JobTaskSqlTaskDashboardSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public JobTaskSqlTaskDashboard build() {
            final var _resultValue = new JobTaskSqlTaskDashboard();
            _resultValue.customSubject = customSubject;
            _resultValue.dashboardId = dashboardId;
            _resultValue.pauseSubscriptions = pauseSubscriptions;
            _resultValue.subscriptions = subscriptions;
            return _resultValue;
        }
    }
}
