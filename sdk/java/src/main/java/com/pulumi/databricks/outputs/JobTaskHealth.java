// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskHealthRule;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JobTaskHealth {
    /**
     * @return list of rules that are represented as objects with the following attributes:
     * 
     */
    private List<JobTaskHealthRule> rules;

    private JobTaskHealth() {}
    /**
     * @return list of rules that are represented as objects with the following attributes:
     * 
     */
    public List<JobTaskHealthRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskHealth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<JobTaskHealthRule> rules;
        public Builder() {}
        public Builder(JobTaskHealth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<JobTaskHealthRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(JobTaskHealthRule... rules) {
            return rules(List.of(rules));
        }
        public JobTaskHealth build() {
            final var o = new JobTaskHealth();
            o.rules = rules;
            return o;
        }
    }
}
