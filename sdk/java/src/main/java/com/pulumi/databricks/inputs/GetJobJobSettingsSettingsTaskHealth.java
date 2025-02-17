// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskHealthRule;
import java.util.List;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskHealth extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskHealth Empty = new GetJobJobSettingsSettingsTaskHealth();

    @Import(name="rules", required=true)
    private List<GetJobJobSettingsSettingsTaskHealthRule> rules;

    public List<GetJobJobSettingsSettingsTaskHealthRule> rules() {
        return this.rules;
    }

    private GetJobJobSettingsSettingsTaskHealth() {}

    private GetJobJobSettingsSettingsTaskHealth(GetJobJobSettingsSettingsTaskHealth $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskHealth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskHealth $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskHealth();
        }

        public Builder(GetJobJobSettingsSettingsTaskHealth defaults) {
            $ = new GetJobJobSettingsSettingsTaskHealth(Objects.requireNonNull(defaults));
        }

        public Builder rules(List<GetJobJobSettingsSettingsTaskHealthRule> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(GetJobJobSettingsSettingsTaskHealthRule... rules) {
            return rules(List.of(rules));
        }

        public GetJobJobSettingsSettingsTaskHealth build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
