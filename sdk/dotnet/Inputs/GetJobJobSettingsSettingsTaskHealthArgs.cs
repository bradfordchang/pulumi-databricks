// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskHealthInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("rules", required: true)]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskHealthRuleInputArgs>? _rules;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskHealthRuleInputArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.GetJobJobSettingsSettingsTaskHealthRuleInputArgs>());
            set => _rules = value;
        }

        public GetJobJobSettingsSettingsTaskHealthInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskHealthInputArgs Empty => new GetJobJobSettingsSettingsTaskHealthInputArgs();
    }
}
