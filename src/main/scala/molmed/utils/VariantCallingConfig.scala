package molmed.utils

import org.broadinstitute.sting.queue.QScript
import java.io.File

  /**
   * Config encapsulating all options for the variant calling.
   * 
   * @param	qscript				the qscript to run the commandline wrappers in
   * @param bams				the bam files to run on
   * @param outputDir			output dir
   * @param runSeparatly		Create one vcf per bam sample instead of running on full cohort
   * @param notHuman			true if not running on human sample
   * @param isLowPass			true if low pass
   * @param isExome				true if this is a exome
   * @param	noRecal				true if no recal to be done, e.g. if this is not a human sample
   * @param noIndels			true if indel calling should be skipped
   * @param testMode			true if running in test mode (skips adding dates to files)
   * @param downsampleFraction	downsample to this fraction of the reads (0-1) (Default: None)
   * @param minimumBaseQuality	the minimum base quality to be used for variant calling (Default: None)
   * @param deletions			maximum number of deletions at site to call snp (Default: None)
   * @param noBAQ				skip BAQ calculations
   */
  case class VariantCallingConfig(qscript: QScript,
                                  bams: Seq[File],
                                  outputDir: File,
                                  runSeparatly: Boolean,
                                  notHuman: Boolean,
                                  isLowPass: Boolean,
                                  isExome: Boolean,
                                  noRecal: Boolean,
                                  noIndels: Boolean,
                                  testMode: Boolean,
                                  downsampleFraction: Option[Double] = None,
                                  minimumBaseQuality: Option[Int] = None,
                                  deletions: Option[Double] = None,
                                  noBAQ: Boolean)