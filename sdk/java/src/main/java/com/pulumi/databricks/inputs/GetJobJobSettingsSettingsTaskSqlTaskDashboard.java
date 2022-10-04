// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskSqlTaskDashboard extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskSqlTaskDashboard Empty = new GetJobJobSettingsSettingsTaskSqlTaskDashboard();

    @Import(name="dashboardId", required=true)
    private String dashboardId;

    public String dashboardId() {
        return this.dashboardId;
    }

    private GetJobJobSettingsSettingsTaskSqlTaskDashboard() {}

    private GetJobJobSettingsSettingsTaskSqlTaskDashboard(GetJobJobSettingsSettingsTaskSqlTaskDashboard $) {
        this.dashboardId = $.dashboardId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTaskDashboard defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSqlTaskDashboard $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskDashboard();
        }

        public Builder(GetJobJobSettingsSettingsTaskSqlTaskDashboard defaults) {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskDashboard(Objects.requireNonNull(defaults));
        }

        public Builder dashboardId(String dashboardId) {
            $.dashboardId = dashboardId;
            return this;
        }

        public GetJobJobSettingsSettingsTaskSqlTaskDashboard build() {
            $.dashboardId = Objects.requireNonNull($.dashboardId, "expected parameter 'dashboardId' to be non-null");
            return $;
        }
    }

}
