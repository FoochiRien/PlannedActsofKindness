package plannedactsofkindness.org.plannedactsofkindness.Function;

public class text {

    public String emailTemplate(String receiver, String sender, String signOff){
        String content ="<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>Untitled Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<center>\n" +
                "<table style=\"padding: 20px 20px 10px 20px;\" background=\"http://lendmycard.com/16Things/background.png\">\n" +
                "<tr><td><span style=\"font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif; font-style: italic; font-weight: bold;font-size: 18px;\">"+receiver+",</span></td></tr>\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 18px;\"></div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-style: italic;font-size: 19px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif\">You are coridally invited to join me at</div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><span style=\"font-weight: bold; font-style: italic;font-size: 18px;font-family: Cambria, Hoefler Text, Liberation Serif, Times, Times New Roman, serif\">The Karma Club.</span></td></tr>\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 18px;\"></div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-style: italic; font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif;font-size: 19px;\">May have seen this on my social media,</div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-style: italic;font-size: 19px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif;\">but I wanted to invite you personally!</div></td></tr>\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 18px;\"></div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-style: italic;font-size: 19px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif;\">\"What goes around, comes around.\"</div></td></tr>\n" +
                "<tr><td align=\"center\"><div style=\"font-style: italic;font-size: 19px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif;\">Part of my new social responsibility.</div></td></tr>\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 18px;\"></div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-style: italic;font-size: 19px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif;\">Think you might find it interesting.</div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-style: italic;font-size: 19px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif;\">"+signOff+"<span style=\"font-weight: bold;font-size: 18px;font-style: normal; font-family: Cambria, Hoefler Text, Liberation Serif, Times, Times New Roman, serif\"> — "+sender+" </span></div></td></tr>\n" +
                "\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 14px;\"></div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><a href=\"http://plannedactsofkindness.org/\">\n" +
                "<img width = \"125\" src=\"http://lendmycard.com/16Things/yellowButton.png\">\n" +
                "</a></td><tr>\n" +
                "\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 14px;\"></div></td><tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><a style=\"text-decoration: none; color:#448EE4; font-weight: 800; font-size: 18px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif;\" href=\"www.plannedactsofkindness.org\">\n" +
                "PlannedActsOfKindness.Org</a></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-weight: bold; font-size: 16px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif\">Making the World a Better Place,</div></td></tr>\n" +
                "<tr><td align=\"center\"><div style=\"font-weight: bold; font-size: 16px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif\">One PAK at a Time.</div></td></tr>\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 12px;\"></div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\"><div style=\"font-size: 15px;font-family: Baskerville, Palatino Linotype, Palatino, Century Schoolbook L, Times New Roman, serif\">*No-shoes? No shirt? That's OK. Come on in.</div></td></tr>\n" +
                "\n" +
                "<tr><td><div style=\"padding-top: 12px;\"></div></td></tr>\n" +
                "\n" +
                "<tr><td align=\"center\">\n" +
                "\t<span style=\"padding-right: 50px;\"><img width = \"50\" src=\"http://lendmycard.com/16Things/PAK-logo.png\"></span>\n" +
                "\t<span style=\"padding-left: 50px;\"><img width =\"50\" src=\"http://lendmycard.com/16Things/16Things-logo.png\"></span>\n" +
                "</td></tr>\n" +
                "\n" +
                "\n" +
                "</table>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>\n";
        return content;
    }
    public String getStyle(){
        String style = "<style type=\"text/css\">\n" +
                "\tspan{\n" +
                "\t\tfont-family: Gotham, Helvetica Neue, Helvetica, Arial,\"sans-serif\";\n" +
                "\t\t  -webkit-hyphens: auto;\n" +
                "  \t\t\thyphens: auto;\n" +
                "\t}\n" +
                "\t\n" +
                "</style>";
        return style;
    }
    public String getWelcomeKarma(){
        String welcomeKarma = "<div style=\"text-align: center\">\n" +
                " \t<span style=\"font-weight: bold\">What's Your Reason?</span><br/>\n" +
                " \t<div style=\"text-align: left;display: inline-block\">\n" +
                "\t\t<ul class=\"dashed\">\n" +
                "\t\t<li>Purely entertainment</li>\n" +
                "\t\t<li>Bored, nothing else to do</li>\n" +
                " \t\t<li>Atoning for past transgressions</li>\n" +
                " \t\t<li>Want to make a difference in the lives of others</li>\n" +
                " \t\t<li>Want to make a difference in your own life</li>\n" +
                " \t\t<li>Want a chance to score some loot</li>\n" +
                " \t\t<li>Want to impress others</li>\n" +
                " \t\t<li>Want a hobby</li>\n" +
                " \t\t<li>Your old club kicked you out</li>\n" +
                " \t\t<li>It's 100% free to join</li>\n" +
                " \t\t<li>It's way cheaper than a dating site</li>\n" +
                " \t\t<li>Looking for the meaning of life</li>\n" +
                " \t\t<li>College Credit</li>\n" +
                " \t\t<li>Community service points</li>\n" +
                " \t\t<li>Brownie points</li>\n" +
                " \t\t<li>Lost a bet</li>\n" +
                " \t\t<li>Won a bet</li>\n" +
                " \t\t<li>Hedging your bets (and if you know what this means, it might be one of your reasons)</li></ul>\n" +
                "</ul>\n" +
                " </div>\n" +
                " </div>\n";
        return welcomeKarma;
    }
    public String getKarmaDescription(){
        String karmaDescription = "<style type=\"text/css\">\n" +
                "\tp.test:first-letter{\n" +
                "\tfloat: left;\n" +
                "    width: 0.7em;\n" +
                "    font-size: 250%;\n" +
                "    line-height: 80%;\n" +
                "\t}\n" +
                "</style>\n" +
                "<p class=\"test\">Whatever your reason, everyone journey starts with the first step. Where you go from there...is entirely up to you!</p>\n" +
                "\n" +
                "<p>The Karma Club was created to be a benefit for everyone: From the people that perform the PAKs, to the people that are touched by them. <span>But it is what you make it.</span></p>\n" +
                "<p>Put in minimal effort and you'll get back minimal returns. Do more of the daily PAKs and other outreach programs, and a world of possibilities will open up for you in ways that you never could have imagined. And as your Planned Acts of Kindness multiply, may your life be infinitely blessed.</p>";
        return getStyle()+karmaDescription;
    }
    public String getKarmaReward(){
        String karmaReward = "<div style=\"text-align: center\">\n" +
                "\t\t<div style=\"display: inline-block;text-align: left\">\n" +
                "\t\t<span style=\"font-weight: bold; font-size: 18px\">Get Rewarded! </span>\n" +
                "\t\t<span>Members with active Level Certificates are automatically eligible to receive the<span style=\"font-weight: bold\"> Daily Gift Giveaway </span></span>\t\n" +
                "\t\t<span>(AKA the Karma Come around) based on their completed levels. *Eligible PAK-ers can receive a maximum of one Karma Come around gift per month.</span><br/>\n" +
                "\t\t<br/>\n" +
                "\t\t<span><span style=\"font-weight: bold; font-size: 18px\">Be A Leader! </span>PAKers can only move up one level per month by achieving all four objectives in the month. Failure to maintain all four level objectives by the end of each month will result in falling back to the previous months level.</span><br/>\n" +
                "\t\t<br/>\n" +
                "\t\t<span><span style=\"font-weight:bold; font-size: 18px\">The Path Ahead:  </span>Become a member now, and pass it on through your social network. The month after we reach 100,000 members, the world will wake up to a new PAK each day!</span><br/>\n" +
                "</div>\n" +
                "</div>";
        return getStyle()+karmaReward;
    }

    public String getKarmaWork(){
        String karmaWork = "<div style=\"text-align: center;\">\n" +
                "<div style=\"display: inline-block; text-align: left\">\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">How Does The Karma Club Work?</span><br/>\n" +
                "<span style=\"display: text-align: left\">Everyone that joins the Karma Club starts off as member. The goal each month is to perform enough activities in four different objectives to move up a level.</span><br/>\n" +
                "<br/>\n" +
                "<span><span style=\"font-weight: bold; font-size: 18sp\">Take Action! </span>Your four objectives:</span><br/>\n" +
                "<span style=\"display: text-align: left\">#1: Completed PAKs per month</span><br/>\n" +
                "<span>#2: Inspire others to take PAK Pledge</span><br/>\n" +
                "<span>#3: Volunteer on 16Things programs</span><br/>\n" +
                "<span>#4: Help with Donations &amp; Sponsorships</span><br/>\n" +
                "<br/>\n" +
                "<span><span style=\"font-weight: bold; font-size: 18px\">Move Up To The Next Level!  </span>Obtain all four objectives during a month and move up to the next level the following month.</span><br/>\n" +
                "<br/>\n" +
                "<span><span style=\"font-weight: bold; font-size: 18px\">Get Rewarded!</span> When you Level Up during a month, you earn your Active Member Level Certificate, issued at the beginning of the following month.</span>\n" +
                "\t\t\n" +
                "\t</div></div>\n";
        return getStyle()+karmaWork;
    }
    public String getVolunteer(){
        String volunteer =
                "<div style=\"text-align: center;\">\n" +
                        "<span style=\"font-size: 22px;font-weight: bold\">Wanted: Volunteers</span><br/>\n" +
                        "<span style=\"font-size: 22px;font-weight: bold\">To Change The World!</span><br/>\n" +
                        "<br/>\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "<span style=\"font-weight: bold; font-size: 18px\">Critical Problems: </span><span>Watch the news, listen to the radio, read a newspaper or just have a serious conversation with a family member, friend or associate, and it won't take you long to know that we are confronted by a whole host of problems on a constant basis: Income inequality, racial divides, climate change, terrorism, war, poverty, lack of quality education, cost of goods and services, health issues, environmental issues, education issues...the list goes on and on and on.</span><br/>\n" +
                        "<br/>\n" +
                        "<span style=\"font-weight: bold; font-size: 18px\">Critical Needs: </span><span>It's obvious that these problems won't fix themselves, and we can't wait around for our political, business and education \"leaders\" to fix them either. When it really comes to it, we can be the best source of change in the country (and the world) if we work together to make things happen.</span><br/>\n" +
                        "</div></div><br/>";
        return getStyle()+volunteer;
    }
    public String getVolunteer_page2(){
        String volunteer2 =
                        "<div style=\"text-align: center;\">\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">16 Things Volunteer Activities</span><br/>\n" +
                        "<br/>\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "<span style=\"font-weight: bold; font-size: 18px\">Critical Action: </span><span>Ever want to do more than serve food at a soup kitchen, pick up trash in a park or spend your afternoon walking for cause? Well, this is your chance to make an impact and change lives... including your own.</span><br/>\n" +
                        "\t</div>\n" +
                        "\t<br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-size: 18px;font-weight: bold\">Maybe It's Time You Volunteered</span><br/>\n" +
                        "\t<span style=\"font-size: 18px;font-weight: bold\">With Us&nbsp;...&nbsp;After all,</span><br/>\n" +
                        "\t<span style=\"font-size: 18px;font-weight: bold\">What Goes Around Comes Around</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<div style=\"text-align: left;display: inline-block\">Choose Your Mission(s)\n" +
                        "\t<ul class=\"dashed\">\n" +
                        "\t<li>Do Social Media Our Programs</li>\n" +
                        "\t<li>Create Social Responsibility Viral Videos</li>\n" +
                        "\t<li>Donate Your Talents to Make Things Happen</li>\n" +
                        "\t<li>Do Local Community Outreach</li>\n" +
                        "\t<li>Do National Outreach</li>\n" +
                        "\t<li>Do Global Outreach</li>\n" +
                        "\t<li>Fundraise for Programs &amp; Scholarships</li>\n" +
                        "\t<li>Create Content for \"16 Things\" TV Shows</li>\n" +
                        "\t<li>Work on our 16 Things Book Series</li>\n" +
                        "\t<li>Give Legacy Building Workshops</li>\n" +
                        "\t<li>Start a 16 Things Social Responsibility Club</li>\n" +
                        "\t<li>Can you say Telethon? Good! Let's do it!</li>\n" +
                        "\t<li>Help Establish a Community Partnership Center</li>\n" +
                        "\t<li>Come up with your own idea(s) &amp; pitch us!</li>\n" +
                        "\t\t</ul>\n" +
                        "\t</div>\n" +
                        "\t</div>";
        return getStyle()+volunteer2;
    }
    public String getSocialResponsibility(){
        String socialResponsibility =
                "<div style=\"text-align: center\">\n" +
                        "\t<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t\t<span style=\"font-weight: bold; font-size: 18px\">Our Mission: </span><span>16 Things is a 501(c)3 non-profit educational organization that works for the betterment of kids, people &amp; the planet through a series of books, workshops, programs &amp; activities all designed to help people lead happier, healthier and more successful lives.</span><br/>\n" +
                        "\t\t<br/>\n" +
                        "\t\t\n" +
                        "\t\n" +
                        "\t<table>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<td width=\"144\" style=\"font-weight: bold\">Who Do</td>\n" +
                        "\t\t\t<td width=\"132\" style=\"font-weight: bold\">Where Do</td>\n" +
                        "\t\t</tr>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<td style=\"font-weight: bold\">We Help?</td>\n" +
                        "\t\t\t<td style=\"font-weight: bold\">We Help?</td>\n" +
                        "\t\t</tr>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<td>\n" +
                        "\t\t\t<ul>\n" +
                        "\t\t\t<li>Student</li>\n" +
                        "\t\t\t<li>Employees</li>\n" +
                        "\t\t\t<li>Owners</li>\n" +
                        "\t\t\t<li>Retirees</li>\n" +
                        "\t\t\t<li>Unemployed</li>\n" +
                        "\t\t\t\t</ul>\n" +
                        "\t\t\t</td>\n" +
                        "\t\t\t<td>\n" +
                        "\t\t\t\t<ul>\n" +
                        "\t\t\t\t<li>Schools</li>\n" +
                        "\t\t\t\t<li>Churches/Temples</li>\n" +
                        "\t\t\t\t<li>Non-Profits</li>\n" +
                        "\t\t\t\t<li>Agencies</li>\n" +
                        "\t\t\t\t<li>Businesses</li>\n" +
                        "\t\t\t\t</ul>\n" +
                        "\t\t\t</td>\n" +
                        "\t\t</tr>\n" +
                        "\t</table>\n" +
                        "\t</div></div>";
        return getStyle()+socialResponsibility;
    }
    public String getHowWeHelp1(){
        String howWeHelp =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-size: 22px; font-weight: bold\">How We Help</span><br/>\n" +
                        "<br/>\n" +
                        "\t<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t\t<span style=\"font-weight: bold; font-size: 18px\">Our Books: </span><span>From providing solutions</span>\n" +
                        "\t\t<span>to economic inequality in the book</span><span style=\"font-weight: bold; font-size: 18px\"> The\n" +
                        "\t\tWorking Dead </span><span>to our 16 Things Book\n" +
                        "\t\tSeries with titles like:</span><span style=\"font-weight: bold; font-size: 18px\"> 16 Things Kids\n" +
                        "\t\tCan Do To Act Right &amp; Help Save the Planet!</span><span style=\"font-style: italic\"> — Harlem Globetrotters Special Edition.</span><br/>\n" +
                        "\t\t<br/>\n" +
                        "\t\t<span>\n" +
                        "\t\t Each book in the series details 16 problems people face along with 32 contributing experts, two to each problem. The experts share why we need to solve the problem along with what we need to do to solve it — in order to make a difference in our life, our family and our future.</span><br/>\n" +
                        "\t\t<br/>\n" +
                        "\t\t<span style=\"font-weight: bold;font-size: 18px\">Workshops: </span><span>16 Things has developed a series of comprehensive workshops designed to educate people to take action on a host of important life issues.</span><br/>\n" +
                        "\t\t<br/>\n" +
                        "\t\t<span>Our Better Communication &amp; Literacy Workshops are peer to peer support groups that use 16 Things Books as the foundation for personal development and building friendships.</span>\n" +
                        "\t\t<div style=text-align:right>- more -</div>\n" +
                        "\t</div></div>\n" +
                        "\t";
        return getStyle()+howWeHelp;
    }
    public String getHowWeHelp2(){
        String howWeHelp2 =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold;font-size: 22px\">How We Help</span><br/><br/>\n" +
                        "<div style=\"text-align: left; display: inline-block\">\n" +
                        "<span style=\"font-weight: bold; font-size: 18px\">16 Things Programs</span>\n" +
                        "\t<ul>\n" +
                        "\t\t<li>Planned Acts of Kindness</li>\n" +
                        "\t\t<li>\"National Kids Month\"</li>\n" +
                        "\t\t<li>16 Things Book Publishing</li>\n" +
                        "\t\t<li>Community Outreach Educational Workshops, Seminars and Summits</li>\n" +
                        "\t\t<li>After School &amp; Summer Programs</li>\n" +
                        "\t\t<li>Basketball &amp; Bonding</li>\n" +
                        "\t\t<li>Youth Learn &amp; Earn Program</li>\n" +
                        "\t\t<li>Mentorship, Internship, Work Experience</li>\n" +
                        "\t\t<li>Adult Career Programs</li>\n" +
                        "\t\t<li>Organizational &amp; Business Programs</li>\n" +
                        "\t\t<li>Entrepreneurship &amp; Ownership Program</li>\n" +
                        "\t\t<li>16 Things TV Programs (coming soon!)</li><br/>\n" +
                        "\t</ul>\n" +
                        "\t<span style=\"font-weight: bold;font-size: 18px\">Our Activities:</span>\n" +
                        "\t<span>Everything we do is centered around the objectives of helping people lead happier, healthier and more successful lives.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>We believe everyone deserves an equal opportunity to fulfill their goals and dreams regardless of race, religion, gender, age, nationality, income or formal education... All it takes is the proper education, opportunity and action.</span>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "\t\t";
        return getStyle()+howWeHelp2;
    }
    public String getNationalKidsMonth(){
        String nationalKidsMonth =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">National Kids' Month</span><br/><br/>\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t<span>People need to be engaged and energized in core areas that affect their quality of life regardless of their education or background.</span><br/><br/>\n" +
                        "\t<span>Working in conjunction with other NPOs, Churches/Temples, Schools, Agencies and Businesses, each week in August will be devoted educating and transforming lives in the following subjects:</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>Week 1: Health, Nutrition &amp; Fitness</span><br/>\n" +
                        "\t<span>Week 2: Financial Literacy &amp; Planning</span><br/>\n" +
                        "\t<span>Week 3: Communication &amp; Literacy</span><br/>\n" +
                        "\t<span>Week 4: Social Responsibility &amp; Volunteerism</span><br/>\n" +
                        "</div>\n" +
                        "<br/><br/>\n" +
                        "<span style=\"font-weight: bold;font-size: 18px\">Help Make It Happen</span><br/>\n" +
                        "<span style=\"font-weight: bold;font-size: 18px\">Sign Up... Help Out!</span><br/><br/>\n" +
                        "</div>";
        return getStyle()+nationalKidsMonth;
    }
    public String getCustomBenefitPlans1(){
        String CustomBenefitPlans1 =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">Custom Benefit Plans</span><br/>\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">For Everyone</span><br/><br/>\n" +
                        "\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t<span>Regardless of education or income, everyone deserves the opportunity to live a happy, healthy and successful life. Unfortunately, as it stands now, the majority of us are going to have difficulties obtaining our goals.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>At the root of our problems are the institutions that work against us: Our schools don't provide the \"right\" education for today's realities, and the companies we work for, our banks, Wall Street and the government -- all have the roles they play in the problems 99% of us encounter during our lives.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>We provide Custom Benefit Plans through Schools, Churches/Temples, NPOs, Agencies and Business (they all have their own objectives as to why they let us in) to help individuals and families (i.e., owners, employees, contractors, spouses, children as well as the retired, veterans, and unemployed) build for their future.</span><br/>\n" +
                        "\t</div><br/>\t\n" +
                        "\t<div style=text-align:right>- more -</div>\n" +
                        "\t</div>";
        return getStyle()+CustomBenefitPlans1;
    }
    public String getCustomBenefitPlans2(){
        String CustomBenefitPlans2 =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">Custom Benefit Plans</span><br/>\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">For Everyone</span><br/><br/>\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t<span>Our programs provide safety, growth, protections and tax advantages that you cannot get from banks, 401k/403b/457 retirement plans, IRAs, SEPs, etc.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>Our goal is to provide people with retirement plans where their money isn't subject to market loss, penalties on withdrawals or taxation when you need the money. Likewise, you are free to withdraw funds for emergencies, children's education, home ownership, vacations, etc.</span><br/><br/>\n" +
                        "\t<span>It's your money. We just make sure it stays your money.</span><br/>\n" +
                        "\t\n" +
                        "\n" +
                        "\t</div><br/><br/>\n" +
                        "\t<span style=\"font-weight: bold\">Our Mission Is Education</span><br/>\n" +
                        "\t<span style=\"font-weight: bold\">Our Success Is People Taking Action</span><br/>\n" +
                        "\t<span style=\"font-weight: bold\">For Themselves, For Their Family</span><br/>\n" +
                        "\t<span style=\"font-weight: bold\">And For Their Future</span><br/><br/>\t\n" +
                        "\t</div>\n";
        return getStyle()+CustomBenefitPlans2;
    }
    public String getGLobalOutReachProgram(){
        String GLobalOutReachProgram =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">Global Outreach Programs</span><br/><br/>\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t<span>The problems we face in our country are not confined to just our citizens. Regardless of your nationality, people all over the world face similar fundamental issues: Health, financial well-being, quality of life.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>Our book series will not just be translated into other languages because we have the answers for the rest of the world on these issues.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>With your help, we will be creating Board of Advisors comprised of experts and influencers from every country. BOA members are charged with the social responsibility of pulling together experts for inclusion in the books in order to make the information culturally relevant and expedient to the people in that specific country.</span><br/>\n" +
                        "\t<br/>\t\n" +
                        "\t<span>Additionally, everything from our educational programs, workshops, work and entrepreneurship programs will be available in service to others.</span><br/>\n" +
                        "\t</div><br/><br/>\n" +
                        "\t<span style=\"font-weight: bold\"> Everyone Matters</span><br>\n" +
                        "\t<span style=\"font-weight: bold\">Sign Up...To Help Out</span>\n" +
                        "\t</div>";
        return getStyle()+GLobalOutReachProgram;
    }
    public String getMentorshipsInternship1(){
        String MentorshipsInternship1 =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">Mentorships, Internships</span><br/>\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">&amp; Work Experience</span>\n" +
                        "<br/><br/>\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t<span>From our Internship and Work Experience programs to our Campus Social Responsibility Clubs to our Career Track Professional Positions: Our Mission is education and we provide students on the college level with a host of programs to get them involved and earning real world experience while contributing to the Mission of our organization: Working for the Betterment of Kids, People &amp; The Planet!</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>In addition to gaining valuable real world skills in your area of interest, we use an inter-disciplinary approach where everyone in our programs get communication, business, marketing, management, research, office technology, problem solving and time management training... because these are the skills you need to be successful, both professionally and personally.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t</div>\n" +
                        "\t<div style=\"text-align:right\">- more -</div>\n" +
                        "\t</div>";
        return getStyle()+MentorshipsInternship1;
    }
    public String getMentorshipsInternship2(){
        String MentorshipsInternship2 =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">Mentorships, Internships</span><br/>\n" +
                        "<span style=\"font-weight: bold; font-size: 22px\">&amp; Work Experience</span>\n" +
                        "<br/><br/>\n" +
                        "<div style=\"display: inline-block; text-align: left\">\n" +
                        "\t<span style=\"font-weight: bold; font-size: 18px\">> Business/Entrepreneurship: </span>\n" +
                        "\t<span>Marketing, Business Management, Finance, Advertising, PR, Communications, Social Media for Books, Workshops, Programs, and Television.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 18px\">> Publishing: </span>\n" +
                        "\t<span>Graphic Design, Writing, Business Management, Marketing, Advertising, PR &amp; Communication, Special Events for Book Printing &amp; Distribution.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 18px\">> Video Production/Visual Media:</span>\n" +
                        "\t<span>All phases of Pre-, Production, Post-Production for Television, Internet TV and Special Programs including one-hour \"16Things TV Magazine\" series, Educational Events/Workshops, and 24-Hour Telethons.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 18px\">> Graphic Arts: </span>\n" +
                        "\t<span>Photoshop, InDesign, Illustrator, Quark, Flash, Shockwave for Books, Board Games, Publication &amp; Print Work, Web-Site Construction, Apps. shops, and 24-Hour Telethons.</span><br/>\n" +
                        "\t</div>\n" +
                        "\t<br/>\n" +
                        "\t<div style=\"text-align:right\">- more -</div>\n" +
                        "\t</div>\n";
        return getStyle()+MentorshipsInternship2;
    }
    public String getMentorshipsInternship3(){
        String MentorshipsInternship3 = "<div style=\"text-align: center\">\n" +
                "<span style=\"font-weight: bold; font-size: 22px\">Mentorships, Internships</span><br/>\n" +
                "<span style=\"font-weight: bold; font-size: 22px\">&amp; Work Experience</span>\n" +
                "<br/><br/>\n" +
                "<div style=\"display: inline-block; text-align: left\">\n" +
                "\t<span style=\"font-weight: bold; font-size: 18px\">> Meeting &amp; Special Events: </span>\n" +
                "\t<span>From Location Scouting to Coordination and Management for Workshops, Fund-Raisers, Galas, Auctions, Seminars, Auditions, TV Production Shoots.</span><br/>\n" +
                "\t<br/>\n" +
                "\t<span style=\"font-weight: bold; font-size: 18px\">> App, Web-Site Development &amp; Computer Programming: </span>\n" +
                "\t<span>HTML, ASP, SQL, Photoshop, Web-Site to Database, Shopping Cart, Android &amp; Apple App Development; WordPress Site Development.</span><br/>\n" +
                "\t<br/>\n" +
                "\t</div>\n" +
                "\t<br/>\n" +
                "\t<span style=\"font-weight: bold; font-size: 18px\">Do Have The </span>\n" +
                "\t<span style=\"font-weight: bold; font-size: 18px\">Desire &amp; Determination</span><br/>\n" +
                "\t<span style=\"font-weight: bold; font-size: 18px\">To Develop into Someone</span><br/>\n" +
                "\t<span style=\"font-weight: bold; font-size: 18px\">That Really Makes a Difference?</span><br/>\n" +
                "\t</div>";
        return getStyle()+MentorshipsInternship3;
    }
    public String getAdultWorkAndCareer1(){
        String adultWorkAndCareer1 =
                "<div style=\"text-align: center\">\n" +
                        "<span style=\"font-weight: bold;font-size: 20px\">Adult Work &amp; Career</span><br/>\n" +
                        "<span style=\"font-weight: bold;font-size: 20px\">Programs</span><br/><br/>\n" +
                        "\t<div style=\"text-align: left;display: inline-block\">\n" +
                        "\t<span>One of the fundamental areas that people struggle with over their lifetimes is money. More specifically, finances. In keeping with our mission, we created several excellent programs that provide people with the opportunity to learn and earn a five- or six- figure income while helping educate and protect individuals and families on many important areas of their lives.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>We provide a variety of free seminars and workshops to teach people financial concepts they need to know in order to build effective retirement plans, educational funding plans, and estate preservation plans</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>If you think you already know this information, it's still worth it to check it out. We meet with CPA, CFP, CFAs, Owners, Business people, Educators, MBAs, Lawyers, Accountants, etc. 95% of them don't know the information that we teach, and highly value what we share.</span><br/>\n" +
                        "\t</div>\n" +
                        "\t<br/>\n" +
                        "\t<div style=\"text-align: right\">- more -</div>\n" +
                        "</div>";
        return getStyle()+adultWorkAndCareer1;
    }
    public String getAdultWorkAndCareer2(){
        String adultWorkAndCareer2 =
                "<div style=\"text-align: center\">\n" +
                        "<div style=\"text-align: left; display: inline-block\">\n" +
                        "\t<span>Our goal is to give everyone, regardless of education or income, the tools they need to become financially independent and achieve their goals and dreams.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span>That doesn't mean that you scraped together $50K, $100K or even $300k....</span>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 18px\">Our goal is for you to be able to live off the interest that your assets generate — so you never have to eat away your principal and run out of money.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 18px\">Most importantly, we make sure our client's hard-earned savings and investments are never at risk due to market loss or health issues like chronic or long term care.</span><br/>\n" +
                        "\t<br>\n" +
                        "\t<span>This is a government regulated, licensed professional career position in the financial services industry. No prior experience is required. All training is provided and you can earn while you learn. The only things you need are (1) desire to help people (2) determination to be successful and (3) a willingness to learn.</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold\">Achieve Your Dreams In Service To Others</span>\n" +
                        "</div>\n" +
                        "</div>\n";
        return getStyle()+adultWorkAndCareer2;
    }
    public String getThinkOfWhatItTakes(){
        String getThinkOfWhatItTakes =
                "<div style=\"text-align: center\">\n" +
                        "\t<span style=\"font-weight: bold;font-size: 20px\">Think You Have What It Takes</span><br/>\n" +
                        "\t<span style=\"font-weight: bold;font-size: 20px\">To Be An Entrepreneur?</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold;font-size: 18px\">We Are Giving Ordinary People</span><br/>\n" +
                        "\t<span style=\"font-weight: bold;font-size: 18px\">The Opportunity To Own A ...</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold;font-size: 20px\">Community Partnership Center</span><br/>\n" +
                        "\t<span style=\"font-size: 12dp\">Providing a Network of Essential Social Responsibility</span><br/>\n" +
                        "\t<span style=\"font-size: 12dp\">Services &amp; Programs serving Students, Employees, Owners</span><br/>\n" +
                        "\t<span style=\"font-size: 12dp\">Retirees &amp; The Unemployed by Partnering with Schools,</span><br/>\n" +
                        "\t<span style=\"font-size: 12dp\">Churches/Temples, Non-Profits, Agencies &amp; Business</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 20px;background: #33B5E5\">100K is Up For Grabs!</span><br/>\n" +
                        "\t<br/>\n" +
                        "\t<div style=\"text-align: left;display: inline-block\">\n" +
                        "\t\t<span>Ever want to own you own business, but:</span>\n" +
                        "\t\t<ul>\n" +
                        "\t\t<li>Didn't have the capital?</li>\n" +
                        "\t\t<li>Didn't have the experience?</li>\n" +
                        "\t\t<li>Didn't have the \"right\" system?</li>\n" +
                        "\t\t<li>Were too busy to making someone else rich to take the time?</li>\n" +
                        "\t\t</ul>\n" +
                        "\t</div>\n" +
                        "\t<br/>\n" +
                        "\t<br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 20px\">We Got The Money.</span><br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 20px\">We Got The System.</span><br/>\n" +
                        "\t<span style=\"font-weight: bold; font-size: 20px\">What Do You Got?</span><br/>\n" +
                        "\t<span style=\"font-size: 16dp\">Sponsored by Lyle Benjamin, Founder of</span><br/>\n" +
                        "\t<span style=\"font-size: 16dp\">Planned Acts of Kindness</span><br/>\n" +
                        "\t<span style=\"font-size: 16dp\">16 Things Kids Can Do &amp;</span><br/>\n" +
                        "\t<span style=\"font-size: 16dp\">The Entrepreneurs Small Business Network</span>\n" +
                        "</div>";
        return getStyle()+getThinkOfWhatItTakes;
    }
    public String getCredit(){
        String credit =
                "<div style=\"text-align: center\">\n" +
                "<span style=\"font-weight: bold; font-size: 22px\">Credits</span><br/>\n" +
                "<br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">Planned Acts of Kindness</span><br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">The Karma Club</span><br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">16 Things Kids Can Do</span><br/>\n" +
                "<br/>\n" +
                "<br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">Created, Written &amp; Designed by:</span><br/>\n" +
                "<span style=\"font-weight: bold;color: #0840BD; font-size: 18px\">Lyle Benjamin</span><br/>\n" +
                "<br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">Android App Construction by:</span><br/>\n" +
                "<span style=\"font-weight: bold;color: #0840BD; font-size: 18px\">Ka Kei \"William\" Pun</span><br/>\n" +
                "<br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">Karma Club Programming by:</span><br/>\n" +
                "<span style=\"font-weight: bold;color: #0840BD; font-size: 18px\">Rob Adamo</span><br/>\n" +
                "<br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">PAK App Graphic Pages by:</span><br/>\n" +
                "<span style=\"font-weight: bold;color: #0840BD; font-size: 18px\">Jordan Ryan</span><br/>\n" +
                "<br/>\n" +
                "<span style=\"font-weight: bold; font-size: 18px\">Social Media by:</span><br/>\n" +
                "<span style=\"font-weight: bold;color: #0840BD; font-size: 18px\">Briana Garcia</span><br/>\n" +
                "<span style=\"font-weight: bold;color: #0840BD; font-size: 18px\">Christina Buffaline</span><br/>\n" +
                "<span style=\"font-weight: bold;color: #0840BD; font-size: 18px\">John Saeteros</span><br/>\n" +
                "</div>";
        return getStyle()+credit;
    }
    public String getTheWorldIsEnding(){
        String theWorldIsEnding = "<div style=\"text-align: center;\">\n" +
                " <span style=\"font-weight: bold;font-size: 20px;\">The World As We Know It Will Come To An End By The Year 2035 — Unless …</span><br/>\n" +
                " <br/>\n" +
                " <div style=\"text-align: left;display: inline-block;\">\n" +
                " <span>If you listen to the pundits and prognosticators, the world is poised on the edge of a knife:</span><br/>\n" +
                " <span style=\"font-weight: bold;\">Scientists</span><span> have concluded that Climate Change is the biggest threat to our survival.</span><br/>\n" +
                "  <span style=\"font-weight: bold;\">Politicians</span><span> have concluded that Terrorism is the biggest threat to our survival.</span><br/>\n" +
                "  <span style=\"font-weight: bold;\">Generals</span><span> have concluded that War is the biggest threat to our survival.</span><br/>\n" +
                "  <span style=\"font-weight: bold;\">Doctors</span><span> have concluded that a Pandemic is the biggest threat to our survival.</span><br/>\n" +
                "  <span style=\"font-weight: bold;\">Economists</span><span> have concluded that Over Population is the biggest threat to our survival.</span><br/>\n" +
                "  <br/>\n" +
                "  <span>And what do all these doomsday scenarios have in common?  Us. They are all man made problems that have escalated with the speed of a bullet over the last 100 hundred years. So now the question is, “What are we going to do about it to survive.?”</span><br/>\n" +
                "  <br/>\n" +
                "  <span>Lyle Benjamin, Executive Director of the non-profit educational organization, “16 Things Kids Can Do,” believes he has the answer:  Us.  People.  Not governments acting nationalistic. Not corporations out for short term profits. But people. The same people who are often divided by nationality, language, religion, race, gender and economics.</span><br/>\n" +
                "  <br/>\n" +
                "  <span>Benjamin is calling for a Karmic Constitution. One that seeks to unite people from all over the world, acting for a common cause, with a common spirit: The survival of the planet.</span><br/>\n" +
                "  <br/>\n" +
                "</div>\n" +
                "<span>Key Dates in Civilization:</span><br/>\n" +
                "<span>10,000 BCE</span><br/>\n" +
                "<span>1917 CE</span><br/>\n" +
                "<span>2017 CE</span><br/>\n" +
                "<span>2035 CE</span><br/>\n" +
                " </div>";
        return getStyle()+theWorldIsEnding;
    }
    public String getKarmicConstitution(){
        String karmicConstitution = "<div style=\"text-align: center\">\n" +
                "<span style=\"font-weight: bold;font-size: 20px;\">The Karmic Constitution:</span><br/>\n" +
                "<br/>\n" +
                "<div style=\"text-align: left;display: inline-block;\">\n" +
                "<p style=\"font-weight: bold\">Article I.</p>\n" +
                "<p><span style=\"font-weight: bold\">We the Children </span><span>of the World Unite as One People in Order to Preserve, Protect, Nurture and Grow the Health of Our Planet and Our Global Community; and, do ordain and establish this Karma Constitution for All.</span></p>\n" +
                "<span>Section 1.</span><br/>\n" +
                "<span>The Karma Club is hereby designated at the Global Organization for Supporters of the Karma Constitution.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 2.</span><br/>\n" +
                "<span>Joining the Karma Club is, and always will be, free and open to all the Children of the World regardless of race, color, gender, age, culture, social, economic, political condition or religious ideas.  Supporters of the Karma Constitution who join the Karma Club are initially referred to as Members; e.g., Members of the Human Race.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 3.</span><br/>\n" +
                "<span>Members of the Karma Club are encouraged to make the following PAK Pledge: “I hereby make a PAK to treat others with respect &amp; kindness and to go through life from this day forward acting towards others as I would wish to be treated myself.”</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 4.</span><br/>\n" +
                "<span>Members of the Karma Club are encouraged to distribute their PAK Pledges through Social Media for all the world to see.</span><br/>\n" +
                "<br/>\n" +
                "<p style=\"font-weight: bold\">Article II.</p>\n" +
                "<p>Members of the Karma Club are encouraged to perform four different types of activities during the course of each month. Members that perform the requisite number of actions in all four activities can level up to the next Karmic level.</p>\n" +
                "<span>Section 1.</span><br/>\n" +
                "<span>Action:  Members of the Karma Club are encouraged to take action for the benefit of their family, friends, co-workers and service points by completing and sharing their finished Planned Acts of Kindness on a daily basis.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 2.</span><br/>\n" +
                "<span>Outreach:  Members of the Karma Club are encouraged to inspire others to take action by having them join the Karma Club and take the PAK Pledge.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 3.</span><br/>\n" +
                "<span>Volunteering:  Members of the Karma Club are encouraged to show their commitment to the Bettering the World by Volunteering and taking part in “16 Things Kids’ Can Do” programs around the world.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 4.</span><br/>\n" +
                "<span>Support:  Members of the Karma Club are encouraged to Support “16 Things Kids’ Can Do” outreach programs by securing donations, sponsorships and grants.</span><br/>\n" +
                "<br/>\n" +
                "\n" +
                "<p style=\"font-weight: bold\">Article III.</p>\n" +
                "<span>Section 1.</span><br/>\n" +
                "<span>The Executive Power shall be vested in an Executive Director of the Karma Club, who shall be one and the same individual as the President of 16 Things Kids Can Do, Inc.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 2.</span><br/>\n" +
                "<span>The Executive Director shall have the duty and responsibility to appoint the President, Vice-President, Secretary, Treasurer, etc. of each Karma Club around the World.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 3.</span><br/>\n" +
                "<span>All Karma Club Officials shall serve at the discretion of the Executive Director.</span><br/>\n" +
                "<br/>\n" +
                "\n" +
                "<p style=\"font-weight: bold\">Article IV.</p>\n" +
                "<span>Section 1.</span><br/>\n" +
                "<span>Anyone who is a member of the Karma Club can be nominated for “Person of the Week.”</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 2.</span><br/>\n" +
                "<span>Only Members of the Karma Club can nominate another member for “Person of the Week.”</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 3.</span><br/>\n" +
                "<span>The final selection for the “Person of the Week” shall reside with the Executive Director.</span><br/>\n" +
                "<br/>\n" +
                "<p style=\"font-weight: bold\">Article V.</p>\n" +
                "<span>Section 1.</span><br/>\n" +
                "<span>Anyone who is a member of the Karma Club can nominate a subject for the “Cause of the Month.”</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 2.</span><br/>\n" +
                "<span>Only Members of the Karma Club can vote on their choice for the “Cause of the Month.”</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 3.</span><br/>\n" +
                "<span>The final selection for the “Cause of the Month” shall reside with the Executive Director.</span><br/>\n" +
                "<br/>\n" +
                "\n" +
                "<p style=\"font-weight: bold\">Article VI.</p>\n" +
                "<span>Section 1.</span><br/>\n" +
                "<span>Members of the Karma Club are encouraged to build connections with others in the Global Community to further the mission and vision of the Karma Club, Planned Acts of Kindness, and 16 Things Kids Can Do, Inc.</span><br/>\n" +
                "<br/>\n" +
                "<span>Section 2.</span><br/>\n" +
                "<span>Members of the Karma Club are encouraged to submit new ideas and proposals with the objective of furthering the mission and vision of the Karma Club, Planned Acts of Kindness, and 16 Things Kids Can Do, Inc.</span><br/>\n" +
                "<br/>\n" +
                "\n" +
                "<p style=\"font-weight: bold\">Article VII.</p>\n" +
                "<p>This Constitution, and the Principles contained herein shall be made in Pursuance thereof; and all Treaties made, or which shall be made, under the Authority of the Children of the World, shall be the supreme Law of the Land; and the Members in every Community shall be bound thereby, anything in the Constitution or Laws of any Nation to the Contrary notwithstanding.</p>\n" +
                "<p>Done by the Unanimous Consent of the Members present the first Day of July in the Year of our Lord two thousand and seventeen hundred in Witness whereof We have hereunto subscribed our Names:</p>\n" +
                "<ul style=\"list-style: none\">\n" +
                "\t<li>Lyle Benjamin, Executive Director</li>\n" +
                "\t<li>Ellisen Wang</li>\n" +
                "\t<li>Briana Garcia</li>\n" +
                "\t<li>Rob Adamo</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "</div>";
        return getStyle()+karmicConstitution;
    }
}