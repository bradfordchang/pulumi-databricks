// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsHealthArgs : global::Pulumi.InvokeArgs
    {
        [Input("rules", required: true)]
        private List<Inputs.GetJobJobSettingsSettingsHealthRuleArgs>? _rules;
        public List<Inputs.GetJobJobSettingsSettingsHealthRuleArgs> Rules
        {
            get => _rules ?? (_rules = new List<Inputs.GetJobJobSettingsSettingsHealthRuleArgs>());
            set => _rules = value;
        }

        public GetJobJobSettingsSettingsHealthArgs()
        {
        }
        public static new GetJobJobSettingsSettingsHealthArgs Empty => new GetJobJobSettingsSettingsHealthArgs();
    }
}
