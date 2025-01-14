// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskHealthRuleArgs;
import java.util.List;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskHealthArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskHealthArgs Empty = new GetJobJobSettingsSettingsTaskHealthArgs();

    @Import(name="rules", required=true)
    private Output<List<GetJobJobSettingsSettingsTaskHealthRuleArgs>> rules;

    public Output<List<GetJobJobSettingsSettingsTaskHealthRuleArgs>> rules() {
        return this.rules;
    }

    private GetJobJobSettingsSettingsTaskHealthArgs() {}

    private GetJobJobSettingsSettingsTaskHealthArgs(GetJobJobSettingsSettingsTaskHealthArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskHealthArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskHealthArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskHealthArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskHealthArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(Output<List<GetJobJobSettingsSettingsTaskHealthRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<GetJobJobSettingsSettingsTaskHealthRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(GetJobJobSettingsSettingsTaskHealthRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public GetJobJobSettingsSettingsTaskHealthArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
