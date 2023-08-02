// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobHealthRuleArgs;
import java.util.List;
import java.util.Objects;


public final class JobHealthArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobHealthArgs Empty = new JobHealthArgs();

    /**
     * list of rules that are represented as objects with the following attributes:
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<JobHealthRuleArgs>> rules;

    /**
     * @return list of rules that are represented as objects with the following attributes:
     * 
     */
    public Output<List<JobHealthRuleArgs>> rules() {
        return this.rules;
    }

    private JobHealthArgs() {}

    private JobHealthArgs(JobHealthArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobHealthArgs $;

        public Builder() {
            $ = new JobHealthArgs();
        }

        public Builder(JobHealthArgs defaults) {
            $ = new JobHealthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rules list of rules that are represented as objects with the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<JobHealthRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules list of rules that are represented as objects with the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder rules(List<JobHealthRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules list of rules that are represented as objects with the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder rules(JobHealthRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public JobHealthArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
